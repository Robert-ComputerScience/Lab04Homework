public class Homework {
    public static void main(String[] args) {
        printHelloWorld(5); // Print "Hello World" 7 times

    }
  // Prints until it hits 7 times
    static void printHelloWorld(int n) {
        if (n > 0) {
            System.out.println("Hello World");
            printHelloWorld(n - 1);
        }


        }
    }




