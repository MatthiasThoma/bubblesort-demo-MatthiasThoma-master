import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {

        products.add(p);

    }

    public void save(String path){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, true))){

            for (Product p : products){
                oos.writeObject(p);
            }
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void load(String path){
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path))){


            Object readObject = ois.readObject();

            while ((readObject = ois.readObject()) != null){
                Product p = (Product) readObject;
                add(p);
            }


        }catch (EOFException eof){
            System.out.println("Alles eingelesen");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public void print(){
        System.out.println("products" + products);
    }
}
