import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoConsoleRead {
    public static void main(String[] args) {
/*
        char [] chara;
        char single = 'a';
        File file = new File("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\newfile.txt");



        if (single != 'x'){
            try (FileOutputStream fos = new FileOutputStream(file, true);) {
                single = (char) System.in.read();
                try {
                    fos.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {

            }
        }
        else {
            System.out.println("There was a x");
        }
    }*/

        int byteRead = 'a';

        File file = new File("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\newfile.txt");
        try (FileOutputStream fos = new FileOutputStream(file, true)){
            while ((byteRead != 'x')){
                fos.write(byteRead = System.in.read());
            }
            fos.flush();
            fos.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
