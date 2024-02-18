import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsExecercise {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
        /*      //QUESTION ONE
        System.out.println("Enter first number: ");
        int number1 = data.nextInt();
        System.out.println("Enter second number: ");
        int number2 = data.nextInt();
        System.out.println("Enter third number: ");
        int number3 = data.nextInt();
        question1(number1, number2, number3);
         */

        /*      //QUESTION TWO
        System.out.print("Enter the number: ");
        int number = data.nextInt();
        question2(number);
        */

        /*      //QUESTION THREE
        System.out.println("Enter the password: ");
        String password = data.nextLine();
        if (question3(password)){
            System.out.println("Password is Valid.");
        }else {
            System.out.println("Password is Invalid");
        }
         */

    }

    public static void question1(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            System.out.println(number1 + " is the smallest value");
        } else if (number2 < number1 && number2 < number3) {
            System.out.println(number2 + " is the smallest value");
        } else {
            System.out.println(number3 + " is the smallest value");
        }
    }

    public static void question2(int number) {
        if (number == 0) {
            System.out.println("Number is Zero");
        } else if (number > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public static boolean question3(String password) {
        /*password rules:
        - password must have at least 10 charachters
        - password consists of only letters and digits
        - password must contain at least two digits
         */
        if (password.length() < 10) {
            return false;
        }
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            if (digitCount >= 2) {
                return true;
            }
        }
        return false;
    }

}
