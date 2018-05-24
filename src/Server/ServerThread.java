package Server;

import Traductor.Traductor;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerThread extends Thread{

    private Socket vSocket;
    private DataOutputStream vDataOut;
    private DataInputStream vDataIn;
    private int vIdSession;

    public ServerThread(Socket socket, int id){

        this.vSocket = socket;
        this.vIdSession = id;

        try {
            vDataOut = new DataOutputStream(this.vSocket.getOutputStream());
            vDataIn = new DataInputStream(this.vSocket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Desconectar(){
        try {
            this.vSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        try {
            String vMsg = this.vDataIn.readUTF();
            Traductor traductor = new Traductor();
            traductor.setText(vMsg);
            traductor.TranslateToBraile();
            String vResp = traductor.getBraille();
            this.vDataOut.writeUTF(vResp);
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        Desconectar();
    }
}
