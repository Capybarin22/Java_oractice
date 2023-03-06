import java.util.Scanner;

class LR2_9 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num_m = input.nextInt();
        int num_r = 1;
        int num_c = 1;

        while (num_r <= num_m) {
            while(num_c <= num_r) {
                System.out.print("*");
                num_c++;
            }
            System.out.println("");
            num_r++;
            num_c = 1;
        }
        
    }
}