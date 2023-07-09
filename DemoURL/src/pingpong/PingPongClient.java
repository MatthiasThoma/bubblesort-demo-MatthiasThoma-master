package pingpong;

import java.io.*;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class PingPongClient {
    public static void main(String[] args) {
        try (Socket server = new Socket("localhost", 1111);
             BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(server.getOutputStream()));
             BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
             BufferedReader cli = new BufferedReader(new InputStreamReader(System.in))){

            String input;

            System.out.println("PING or PONG?");

            while ((input = cli.readLine()) != null){
                if (input.equals("EXIT"))
                    break;

                bw.write(input);
                bw.newLine();    // WICHTIG!!
                bw.flush();
                System.out.println(br.readLine());
            }



        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Verbindung beendet");
    }
}
