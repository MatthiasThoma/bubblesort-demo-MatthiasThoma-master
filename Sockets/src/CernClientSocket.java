import javax.imageio.IIOException;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class CernClientSocket {

    public static void main(String[] args) {



        try (//Neuer Socket und verbindet sich zum Server
                Socket socket = new Socket("news.orf.at", 80);

                //Lesen vom Server:
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //Schreiben am Server
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));)
        {

            bw.write("GET / HTTP/1.1\r\n");
            bw.write("Host: news.orf.at\r\n\r\n");
            bw.flush();

            String line;
            File file = new File("D:\\Users\\Matthias\\Dokumente\\FH\\Programmtexte\\Sockets\\news.http");
            FileWriter fw = new FileWriter("news.http");

            while ((line = br.readLine()) != null){

                fw.write(line);
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
