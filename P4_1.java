//WAP to show the try - catch block to catch the different types of exception.
package Pra4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class P4_1 {
    public static void main(String args[])
    {

        //Arithmetic exception
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }

        //Null pointer exception
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }

        //String index out of bound
        try {
            String a = "This is practical set 4"; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }

        //File not found
        try {
            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }

        //Number format exception
        try {
            // "Jay" is not a number
            int num = Integer.parseInt ("Jay") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }

        //Array index out of bound
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }

        //IO Exception
        // Create a new scanner with the specified String
        Scanner scan = new Scanner("Hello World!");
        // Print the line
        System.out.println("" + scan.nextLine());
        // Check if there is an IO exception
        System.out.println("Exception Output: " + scan.ioException());
        scan.close();
        System.out.println();
        System.out.println("This program is made by 21CE143 Jay");
    }
}
