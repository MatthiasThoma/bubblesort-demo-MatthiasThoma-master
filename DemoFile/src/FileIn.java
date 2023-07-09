import java.io.File;

public class FileIn {

    public static void main(String[] args) {


        File fuckYou = new File("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner");

        System.out.println("Can I read it? " + fuckYou.canRead());
        System.out.println("Is it a file? " + fuckYou.isFile());
        System.out.println("Is it a Directory? " + fuckYou.isDirectory());
        System.out.println("The total Size is " + printAndGetSize(fuckYou));

    }

    public static long printAndGetSize(File fuckYou){


        long size = 0;

        if (fuckYou.isFile()){
            return fuckYou.length();
        }
        for (File files : fuckYou.listFiles()){
            System.out.println(files.getName() + " " + files.length());
            size += files.length();

            if (files.isDirectory()){
                size += printAndGetSize(files);
            }
        }

        return size;
    }
}
