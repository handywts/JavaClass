package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class AllData {

    private ObservableList<Contact> contacts;
    private static AllData instance = new AllData();

    public static AllData getInstance() {
        return instance;
    }

    public AllData() {
    }

    public ObservableList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ObservableList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setElement(Contact c) {
        contacts.add(c);
    }

    public Contact createContact() {
        Contact c = new Contact();
        return c;
    }

    public void saveData() {
        BufferedWriter bw = null;
        File file = new File("contacts.txt");
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            Iterator<Contact> iterator = contacts.iterator();
            while (iterator.hasNext()) {
                Contact item = iterator.next();
                bw.write(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",
                        item.getFirstName(),
                        item.getMiddleName(),
                        item.getLastName(),
                        item.getPhoneNumber(),
                        item.getStreet1(),
                        item.getStreet2(),
                        item.getCity(),
                        item.getState(),
                        item.getZipCode(),
                        item.getPicturePath(),
                        item.getNote()));
                bw.newLine();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bw != null) {
                    bw.close();
                }
            }catch (Exception e) {
                System.out.println("It went wrong");
            }
        }
        //loop that finds each object

        //loop that writes each field to file
    }

    public void loadData() throws IOException{
        contacts = FXCollections.observableArrayList();
        Path path = Paths.get("contacts.txt");
        BufferedReader br = Files.newBufferedReader(path);

        String input;

        try {
            while((input = br.readLine()) != null) {
                String[] itemPieces = input.split("\t");

                String fN = itemPieces[0];
                System.out.println(itemPieces[0]);
                String mN = itemPieces[1];
                System.out.println(itemPieces[1]);
                String lN = itemPieces[2];
                System.out.println(itemPieces[2]);
                String ph = itemPieces[3];
                System.out.println(itemPieces[3]);
                String s1 = itemPieces[4];
                System.out.println(itemPieces[4]);
                String s2 = itemPieces[5];
                System.out.println(itemPieces[5]);
                String city = itemPieces[6];
                System.out.println(itemPieces[6]);
                String state = itemPieces[7];
                System.out.println(itemPieces[7]);
                String zip = itemPieces[8];
                System.out.println(itemPieces[8]);
                String pp = itemPieces[9];
                System.out.println(itemPieces[9]);
                String note = itemPieces[10];
                System.out.println(itemPieces[10]);

                Contact c = new Contact(fN, mN, lN, ph, s1, s2, city, state, zip, pp, note);
                contacts.add(c);
            }
        } finally {
            if(br != null) {
                br.close();
            }
        }
    }

    public void removeData(Contact index) {
        contacts.remove(index);
    }


}
