package miscellaneous.array;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {
    public static void main(String[] args) throws IOException {
//        System.out.println("Please enter your name: ");
//        int returnValue = System.in.read();
//
//        System.out.println("Your name is: " + returnValue);
//
//        System.out.println("======================");

        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.println("Please enter your name: ");
        char[] buf = new char[20];
        reader.read(buf);
        System.out.println("Your name is: " + new String(buf));

        System.out.println("======================");

        InputStreamReader reader2 = new InputStreamReader(System.in);
        System.out.println("Please enter your name: ");
        BufferedReader bufReader = new BufferedReader(reader2);
        String input = bufReader.readLine();
        System.out.println(STR."Your name is: \{input}");
    }
}
