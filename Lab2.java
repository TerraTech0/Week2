import javax.sound.sampled.EnumControl;
import java.lang.reflect.Array;
import java.util.*;

public class Lab2 {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {

//______________________QUESTION1____________________________

//        String[] arr = {"cat", "dog", "red", "is", "am"};
//        System.out.println(question1(arr));

//______________________QUESTION2____________________________

//        int[] arr = {1, 1, 1, 3, 3, 5};
//        question2(arr);

//______________________QUESTION3____________________________

//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//        System.out.println("Original Array: " + Arrays.toString(array));
//        question3(array, k);

//______________________QUESTION4____________________________

//        System.out.println("Reverse numbers are: ");
//        question4();

//----------------------QUESTION5----------------------------

//        question5();

// ---------------------QUESTION6----------------------------

//        int min;
//        int max;
//        int random;
//        System.out.print("Enter the minmum value of the range: ");
//        min = data.nextInt();
//        System.out.print("Enter the maximum value of the range: ");
//        max = data.nextInt();
//        System.out.print("Enter the number of random numbers to generate: ");
//        random = data.nextInt();
//        question6(min, max, random);

//----------------------QUESTION7-----------------------------

//        String password;
//        int totalScore;
//        System.out.print("Enter a password: ");
//        password = data.nextLine();
//        totalScore = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//        evaluate(totalScore);

//----------------------QUESTION8-----------------------------

//        int term;
//        System.out.println("Enter the number of Fibonacci terms to generate: ");
//        term = data.nextInt();
//        question8(term);

//------------------------FINISH------------------------------


    }

    public static ArrayList question1(String[] array) {
        ArrayList arr = new ArrayList<>();
        int longest = 0;

        for (String newarray : array) {
            int len = newarray.length();

            if (len > longest) {
                longest = len;
                arr.clear();
            }
            if (len == longest) {
                arr.add(newarray);
            }
        }
        return arr;
    }

    public static void question2(int[] arr) {
        boolean[] occurce = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (occurce[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    occurce[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times.");
        }
    }

    public static void question3(int[] array, int k) {
        Arrays.sort(array);
        System.out.println(k + " largest elements of the array are:");
        for (int i = array.length - 1; i >= array.length - k; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void question4() {
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void question5() {
        int number;
        int[] array = {};

        do {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Enter elements of the array");
            System.out.println("2. Display array elements");
            System.out.println("3. Search for an element");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            number = data.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Enter the size of the array: ");
                    int size = data.nextInt();
                    array = new int[size];
                    System.out.println("Enter elements of the array: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Enter element at index " + i + ": ");
                        array[i] = data.nextInt();
                    }
                    System.out.println("Array elements accepted successfully.");
                    break;
                case 2:
                    if (array.length == 0) {
                        System.out.println("Array is empty. Please enter elements first.");
                    } else {
                        System.out.println("Array elements:");
                        for (int element : array) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (array.length == 0) {
                        System.out.println("Array is empty. Please enter elements first.");
                    } else {
                        System.out.print("Enter the element to search: ");
                        int searchElement = data.nextInt();

                        for (int i = 0; i < array.length; i++) {
                            if (array[i] == searchElement) {
                                System.out.println("Element found at index " + i);
                                continue;
                            } else {
                                System.out.println("Element not found in the array.");
                            }
                        }

                    }
                    break;
                case 4:
                    if (array.length == 0) {
                        System.out.println("Array is empty. Please enter elements first.");
                    } else {
                        Arrays.sort(array);
                        System.out.println("Array sorted successfully.");
                    }
                    break;
                case 5:
                    System.out.println("Stopping the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (number != 5);
    }

    public static void question6(int min, int max, int count) {
        Random random = new Random();
        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.print(randomNumber);
            if (i < count - 1) {
                System.out.print(" - ");
            }
        }
    }

    public static void evaluate(int totalScore) {
        System.out.println("Total score: " + totalScore);

        if (totalScore >= 8) {
            System.out.println("Password is strong.");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }

    public static int checkLength(String password) {
        int length = password.length();
        if (length <= 5) {
            return 0;
        } else if (length <= 7) {
            return 2;
        } else {
            return 3;
        }
    }

    public static int checkSpecialCharacters(String password) {
        return password.matches(".*[^a-zA-Z0-9].*") ? 2 : 0;
    }

    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        return (hasUpperCase && hasLowerCase) ? 3 : 0;
    }


    public static void question8(int num) {
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci sequence with " + num + " terms:");
        for (int i = 0; i < num; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }


}
