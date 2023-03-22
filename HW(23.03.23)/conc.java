import java.util.Scanner;

class conc {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int countOfnumbers = input.nextInt();
        String text = "";
        for (int i = 0; i <= countOfnumbers; i++) {
            String words = input.nextLine();
            text = text.concat(words + " ") ;
        }
        System.out.println("text:" + text + ";");
    }
}