import java.util.Stack;
import java.util.Scanner;

/**
 * This class provides functionality to input integers from the user,
 * store them in a stack, and sort them from smallest to largest.
 * 
 * Example of Reuse - Reused code from Project 04, except changed data storage
 * to Stacks instead of Linkedlists
 * 
 * @author David Ayriyan
 * @version 1.0.1, Project 05
 * @since Week 5 of CSC6301
 */
public class SortedStack {
    
    // Example of Code Reuse - Used Stack class (instead of LinkedList class)
    // to help help store and manage integers instead of creating
    // my own stack.
    Stack<Integer> integers = new Stack<>(); //creates stack

    // Example of Code Reuse- created a scanner object once, reused
    // throughout program. Avoid uneccessary object creation.
    Scanner sc = new Scanner(System.in); //creating scanner for user input



    /**
     * Prompts the user to input integers and stores them
     * into a stack.
     * @since Week 5 of CSC6301
     */
    private void userInput() {

        // Example of Code Reuse - While loop is reused
        // for more than one user input
        while (true) {
            
            System.out.println("Enter an integer");

            // Example of Code Reuse - created to take input from user, used from
            // scanner class
            int num = sc.nextInt();

            // Proof of maintenance - used push() method from Stack class
            integers.push(num);

            // consumes the leftoever newline character
            sc.nextLine();

            System.out.println("Did you want to enter another number? (yes/no)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                continue;
            }

            else if (choice.equalsIgnoreCase("no")) {
                System.out.println(choice);
                break;
            }

        }
        sc.close();
    }

    /**
    * Sorts the stack from smallest to largest integers
    * and prints the sorted elements.
    * @since Week 5 of CSC6301
    */
    private void sortsInput() {

        // Example of Code Reuse - use built in sort() method provided by Java Collections
        // Frameworkinstead of creating own sorting algorithm
        integers.sort(null); // Sorts the stack

        // Prints the sorted stack
        System.out.println("Stack: " + integers);
    }

    /**
    * Main method of the class. Sorts a stack of integers 
    * from smallest to largest
    * using user inputted numbers.
    * @param  args  default parameter for a main - not used
    * @since Week 5 of CSC6301
    */
    public static void main(String[] args){
        // creating an instance of the class
        SortedStack obj = new SortedStack();

        obj.userInput();
        obj.sortsInput();
    }
}


