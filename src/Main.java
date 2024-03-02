import java.util.Scanner;
public class Main {
    public static void recursive(int number) {          //method is defined.
        if (number <= 0) {
            System.out.print(number + " ");
            return;
        }
        System.out.print(number + " ");

        recursive(number - 5);

        System.out.print(number + " ");

    }
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);            //Scanner is defined.
        System.out.print("Please enter a number: ");    //Get values from user.
        int number = ak.nextInt();

        recursive(number);                              //Method is called.
    }
}