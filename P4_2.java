//WAP to generate user defined exception using “throw” and “throws” keyword.
package Pra4;
import static Pra4.MyCustomException.validate;
class MyCustomException extends Exception {
    public static void validate(int age) throws ArithmeticException{
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
public class P4_2 {
    public static void main(String[] args) {
        try
        {
            // throw an object of user defined exception
            throw new MyCustomException();
        }
        catch (MyCustomException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("This program is made by 21CE143 Jay");
        validate(13);
    }
}
