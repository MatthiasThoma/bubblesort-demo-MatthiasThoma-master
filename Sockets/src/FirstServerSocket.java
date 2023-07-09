import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstServerSocket {

    public static void main(String[] args) {

        // Erzeuge einen Server

        System.out.println("Server wird erstellt");

        try (ServerSocket serverSocket = new ServerSocket(1111)){

            while (true) {
                System.out.println("Warte auf Client");

                Socket client = serverSocket.accept();

                BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(client.getOutputStream())));
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

                bw.write("Hallo Client");
                bw.flush();

                System.out.println("Daten an Client gesendet");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
