import java.util.Scanner;

class LR2_8 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num_n = input.nextInt();
        int num_a = input.nextInt();
        int mul = num_a;
        int count = 1;
        
        while (mul <= num_n) {
            num_a = input.nextInt();
            mul *= num_a;
            count++;
        }

        System.out.print("Количество: " + count + "; Произведение: " + mul + ";");
    }
}