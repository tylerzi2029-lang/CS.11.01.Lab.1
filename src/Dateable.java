import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input scanner created

        String question = "Enter your age: ";
        System.out.print(question);

        int age = input.nextInt();
        int youngestAge = age / 2+7;

        String result = age + "-year olds should date somebody who is at least "
                + youngestAge + " years old.";
        System.out.print(result);
    }
}
