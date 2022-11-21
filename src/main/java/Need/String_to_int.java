import java.util.Scanner;
public class String_to_int {
    public static void main(String[] args) {
        String input;
        int i1,i2,i3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a 3 digit number ");
        input = keyboard.next();
        String[] numbers = input.split("\\s+");
        i1= Integer.parseInt(numbers[0]);
        i2= Integer.parseInt(numbers[1]);
        i3= Integer.parseInt(numbers[2]);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }
}