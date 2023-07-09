import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class ReadInDemo {
    public static void main(String[] args) {
        File f = new File("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\er hörte leise.txt");

        if (!f.exists()){
            System.out.println("Datei existiert nicht!");
            return;
        }

        if (f.canRead()){
            System.out.println("File is readable");
        }


        int readInt = 0;

        int counter = 0;

        try {
            FileInputStream fis = new FileInputStream(f);


            while ((readInt = fis.read()) != -1) {
                char[] chai = Character.toChars(readInt);
                System.out.println(chai);
                counter++;

            }

            }catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }

        System.out.println("Die Gesamtzahl an Zeichen in diesem Text ist " + counter + " Zeichen");
    }


}
