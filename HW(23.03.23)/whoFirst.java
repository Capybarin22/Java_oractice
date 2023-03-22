import java.util.Scanner;

class whoFirst {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       String numbers = input.nextLine();
       String number = input.nextLine();
       System.out.println(numbers.indexOf(number));
       System.out.println(numbers.lastIndexOf(number));
    }
}