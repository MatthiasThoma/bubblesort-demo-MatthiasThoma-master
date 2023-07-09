package pingpong;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer {
    public static void main(String[] args) {
        //erstellen

        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            while (true){

                System.out.println("Server waiting for client");
                Socket client = serverSocket.accept();

                PingPongHandler pingPongHandler = new PingPongHandler(client);
                pingPongHandler.process();
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
