import java.util.Scanner;

class LR2_6 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num_a = input.nextInt();
        int result = 0;

        while(num_a != 0) {
            result += num_a;
            num_a = input.nextInt();
        }
        System.out.print("result = " + result + ";");
    }
}