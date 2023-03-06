import java.util.Scanner;

class LR2_10 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num_s = input.nextInt();
        int num_r = 1;
        int num_c = 1;
        int num_a = 0;
        int length = num_s * 2 + 1;

        while (num_r <= num_s) {
            while (num_c <= length) {
                if (length / 2 - num_a > num_c || num_c > length / 2 + num_a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                num_c++;
            }
            System.out.println("");
            num_c = 1;
            num_a++;
            num_r++;
        }
        
    }
}