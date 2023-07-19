import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String original, reverse = "";  // original and reverse are two Strings
                                        // variables declared to store the original input string
                                        // and its reverse, respectively.

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome");

        original = in.nextLine();   // The program displays a message: "Enter a string to
                                    // check if it's a palindrome" to prompt the user to enter a string.
                                    // it then reads the user's input using in.nextLine() and stores
                                    // it in the original variable ("original")

        int length = original.length();  // Calculate Length of Input:
                                        // The program calculates the length of the
                                        // input string using original.length() and stores
                                        // it in the length variable.

        for (int i = length - 1; i >= 0; i--)  // The program uses a for loop to reverse the
                                                // input string and stores the reversed string in the "reverse" variable.
                                                // The loop starts with the last character of the input string and
                                                // iterates until the first character, effectively reversing the string.

            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))       // After the loop completes, the program
                                            // checks if the original string is equal to the reverse string
                                            // using the equals() method. If they are equal, it means the input
                                            // string is a palindrome; otherwise, it is not.

            System.out.println("The string is a palindrome.");

        else

            System.out.println("The string isn't a palindrome.");

    }
}
