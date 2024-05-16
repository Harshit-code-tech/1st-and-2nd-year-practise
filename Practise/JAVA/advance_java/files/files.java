package advance_java.files;

import java.io.FileWriter;
import java.io.IOException;

public class files {
    public static void main(String[] args) {
        /*


        //code to create a file
        File myfile = new File("andakaphanda.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
            //code to write a file
            try {
                FileWriter FW = new FileWriter("andakaphanda.txt");
                FW.write("tHIS IS MY FIRST FILE\nOKAY NOW BYE ");
                FW.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }



        //Read a file
        File myfile = new File("andakaphanda.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //delete a file
        File myfile = new File("andakaphanda.txt");
        if (myfile.delete()){
            System.out.println("I have deleted the file:"+ myfile.getName());
        }
        else {
            System.out.println("Some error occured");
        }

         */
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

