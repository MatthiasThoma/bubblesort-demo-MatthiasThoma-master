import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

    public class DemoUrl {

        public static void main(String[] args) {

            try {
                URL myUrl = new URL("https://www.amazon.de/");

                try (InputStream inputStream = myUrl.openStream();
                     BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){

                    String line;

                    File camp = new File("D:\\Users\\Matthias\\Dokumente\\FH\\Programmtexte\\URLDemo\\campus.http");

                    FileWriter temp = new FileWriter("campus.http");


                    while ((line = br.readLine()) != null){
                        temp.write(line + "\n");
                        System.out.println(line);
                    }
                    temp.flush();  // WICHTIG !!


                    System.out.println(myUrl.getProtocol());
                    System.out.println(myUrl.getHost());
                    System.out.println(myUrl.getPort());

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
