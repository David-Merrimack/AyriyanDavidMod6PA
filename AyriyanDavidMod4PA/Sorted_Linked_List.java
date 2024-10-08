import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class provides functionality to input integers from the user,
 * store them in a linked list, and sort them from smallest to largest.
 * @author David Ayriyan
 * @version 1.0.0, Project 04
 * @since Week 4 of CSC6301
 */
public class Sorted_Linked_List {
    
    // Example of Code Reuse - Used List and LinkedList class
    // to help help store and manage integers instead of creating
    // my own linked list.
    List<Integer> integers = new LinkedList<>(); //creates linked list

    // Example of Code Reuse- created a scanner object once, reused
    // throughout program. Avoid uneccessary objkect creation.
    Scanner sc = new Scanner(System.in); //creating scanner for user input



    /**
     * Prompts the user to input integers and stores them
     * into a linked list.
     * @since Week 4 of CSC6301
     */
    private void userInput() {

        // Example of Code Reuse - While loop is reused
        // for more than one user input
        while (true) {
            
            System.out.println("Enter an integer");

            // Example of Code Reuse - created to take input from user, used from
            // scanner class
            int num = sc.nextInt();
            integers.add(num);

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
    * Sorts the linked list from smallest to largest integers
    * and prints the sorted elements.
    * @since Week 4 of CSC6301
    */
    private void sortsInput() {

        // Example of Code Reuse - use built in sort() method provided by Java Collections
        // Frameworkinstead of creating own sorting algorithm
        integers.sort(null); // Sorts the linked list

        // Prints the sorted linked list
        System.out.println("LinkedList: " + integers);
    }

    /**
    * Main method of the class. Sorts an linked list of integers 
    * from smallest to largest
    * using user inputted numbers.
    * @param  args  default parameter for a main - not used
    * @since Week 4 of CSC6301
    */
    public static void main(String[] args){
        // creating an instance of the class
        Sorted_Linked_List obj = new Sorted_Linked_List();

        obj.userInput();
        obj.sortsInput();
    }
}

