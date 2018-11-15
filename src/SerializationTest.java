/*
Lyndsey Wilson
ID#684781

 */

import java.io.*;

public class SerializationTest{
    public static void main(String[] args)
    {
        BFSBST<Integer> tree = new BFSBST<>();
        tree.insert(2);
        tree.insert(5);
        tree.insert(6);
        tree.insert(0);
        tree.insert(9);

        tree.traverse();


        try{
            FileOutputStream file = new FileOutputStream("serialized.ser");
            ObjectOutputStream objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(tree);
            objectStream.close();
            file.close();
            System.out.println("tree object serialized in serialized.ser");
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    try{
        FileInputStream file = new FileInputStream("serialized.ser");
        ObjectInputStream object = new ObjectInputStream(file);
        BFSBST<Integer> deserializedTree = (BFSBST<Integer>) object.readObject();
        object.close();
        file.close();
        System.out.println("Deserialized Tree:");
        deserializedTree.traverse();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    }
}