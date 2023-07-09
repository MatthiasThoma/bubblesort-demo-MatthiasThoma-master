import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class NewsOrfSSLCliientSocket {

    public static void main(String[] args) {

        // SSL Socket mithilfe der SSLFactory erzeugen.
        // mittels https verbinden
        // Kanal zum Schreiben öffnne -> outputstream
        // Kanal zum lesen öffnen -> inputstream

        try (Socket socket = SSLSocketFactory.getDefault().createSocket("news.orf.at", 443);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){

            bw.write("GET / HTTP/1.1\r\nHost: news.orf.at\r\n\r\n");
            bw.flush();

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
