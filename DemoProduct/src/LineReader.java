import java.io.*;

public class LineReader {

    public static void main(String[] args) {


        File f = new File("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\er hörte leise.txt");



        {
            try (BufferedReader br = new BufferedReader(new FileReader(
                    "D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\er hörte leise.txt"))){

                String line;

                while((line = br.readLine()) != null){
                    System.out.println(line);
                }


            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }
