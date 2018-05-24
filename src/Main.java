import Server.Server;
import Traductor.Traductor;

public class Main implements Runnable {


    public void run(){
        Server server = new Server(1101);
        server.RunServer();
    }

    public static void main(String[] args) {

        (new Thread(new Main())).start();
        System.out.println("hola");

    }

}
