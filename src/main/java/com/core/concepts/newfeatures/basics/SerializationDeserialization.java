package com.core.concepts.newfeatures.basics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

public class SerializationDeserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1. Serialize object
        Student student1 = new Student("Sukhdev", 42, "sukhdev-dummy-email@gmail.com");

        FileOutputStream fileOutputStream = new FileOutputStream("fios.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student1);


        //2. De-Serialize object
        FileInputStream fileInputStream = new FileInputStream("fios.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student2 = (Student) objectInputStream.readObject();

        System.out.println(student2);

    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Serializable {
    private String name;
    private int age;
    private transient String email;
}
