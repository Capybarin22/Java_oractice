import java.util.Scanner;

class IPAdresses {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String address = input.nextLine();
        String[] numbers = address.split("\\.");

        int rightNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.valueOf(numbers[i]) >= 0 && Integer.valueOf(numbers[i]) <= 255) {
                rightNums++;
            }
        }
        if (rightNums == 4) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}