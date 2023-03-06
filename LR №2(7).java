import java.util.Scanner;

class LR2_7 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num_x = input.nextInt();
        int num_a = num_x;
        int num_n = input.nextInt();

        while(num_x < num_n) {
            num_x += num_a;
        }
        System.out.print("result = " + num_x + ";");
    }
}