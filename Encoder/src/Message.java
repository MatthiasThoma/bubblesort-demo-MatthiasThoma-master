import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Message {

     private String source;
    private String message;

    private String adress;

    public Message(String source, String message, String adress) {
        this.source = source;
        this.message = message;
        this.adress = adress;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public File intake(){

        Scanner in = new Scanner(System.in);

        System.out.println("What source do you want? File (f) or Text (t) ?");
        source = in.next();



        if (source.equals("File") || source.equals("f")) {
            System.out.println("What path do you want the file to come from?");
            adress = in.nextLine();

            File file = new File(adress);
            return file;
        }

        System.out.println("What Message do you want to encode? ");

        message = in.nextLine();

        adress = "D:\\Users\\Matthias\\Dokumente\\FH\\Programmtexte\\Encoder\\default.txt";
        File file = new File(adress);

        try (FileWriter fw = new FileWriter(adress)) {
            fw.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;


    }
}
