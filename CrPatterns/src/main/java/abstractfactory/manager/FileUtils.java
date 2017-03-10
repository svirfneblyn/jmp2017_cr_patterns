package abstractfactory.manager;


import abstractfactory.constants.Constants;
import abstractfactory.entity.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileUtils {


    public static Person readPerson(String fileName) {
      Person person = null;
        Path path = Paths.get(Constants.BASE_DIR + "/" + fileName);
        System.out.println("looking for a file with path : " + path.toString());
        if (Files.exists(path)) {
            try {
                int age = Integer.parseInt(Files.readAllLines(path).get(0));

                person = new Person.Builder()
                        .name(fileName)
                        .age(age)
                        .personType("")
                        .personStrength(0)
                        .build();
            } catch (IOException e) {
                System.out.println("Plese check file:  "+  fileName + " he should contain only age of person");;
            }
        } else {
            System.out.println(" The file with the path : " + path.toString() + "does not exist. Please check the file name and try again");
        }
        return person;
    }

    public static void writePerson(Person person) {
        Path path = Paths.get(Constants.BASE_DIR + "/" + person.getName());
        FileWriter fr = null;
        BufferedWriter br = null;
        System.out.println("creatig new person: " + path.toString());
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
                fr = new FileWriter(path.toString());
                br=new BufferedWriter(fr);
                br.write(person.getAge());
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                try {
                    if(br!=null) {
                        br.close();
                    }
                    if(fr!=null) {
                        fr.close();
                    }
            } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println(" The file with the path : " + path.toString() + " exist. Please check the file name and try again");
        }


    }
}
