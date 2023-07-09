public class Main {
    public static void main(String[] args) {

        ProductManager pm = new ProductManager();

        pm.add(new Product("Mi11 Lite", 110.00, "Handy"));
        pm.add(new Product("M3", 10000.00, "Car"));

        pm.save("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\Products.txt");

        pm.load("D:\\Users\\Matthias\\Dokumente\\FH\\IO\\sub-ordner\\dokumente\\Products.txt");

        pm.print();
    }



}