package Server;

import java.io.*;
import java.net.*;
import java.util.logging.*;

public class Server {

    private int vPort;

    public Server(int port){
        this.vPort = port;
    }

    public void RunServer() {
        ServerSocket ss;
        System.out.print("Inicializando servidor... ");
        try {
            ss = new ServerSocket(this.vPort);
            System.out.println("\t[OK]");
            int idSession = 0;
            while (true) {
                Socket socket;
                socket = ss.accept();
                System.out.println("Nueva conexión entrante: "+socket);
                new ServerThread(socket, idSession).start();
                idSession++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
