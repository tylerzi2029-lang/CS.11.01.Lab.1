import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        int pages = 100 - age;

        System.out.println(age + "-year olds should read at least " + pages
                + " pages before giving up on a book.");

        input.close();
    }
}