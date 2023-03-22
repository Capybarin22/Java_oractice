import java.util.Scanner;

class moreOrLess {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double hidden_num = (Math.random()*(100-1))+1;
        hidden_num = Math.floor(hidden_num);
        // System.out.println("hidden_num = " + hidden_num + ";");
        System.out.print("Guess a number between 1 and 100: ");
        int a = 0;

        String anotherTry = "y";
        for (int count = 0; !anotherTry.equals("n"); count++) {
            a = input.nextInt();
            if (a > hidden_num) {
                System.out.println(a + " is too high, try again");
                System.out.print("Guess a number between 1 and 100: ");
            } else if (a < hidden_num) {
                System.out.println(a + " is too low, try again");
                System.out.print("Guess a number between 1 and 100: ");
            } else if (a == hidden_num) {
                System.out.println(a + " is correct!, You win");
                System.out.println("It only took you " + count + " tries!, Good work!");
                System.out.print("Would you like to play again (y/n)?: ");
                anotherTry = input.next();
                if (anotherTry.equals("y")) {
                    hidden_num = (Math.random()*(100-1))+1;
                    hidden_num = Math.floor(hidden_num);
                    count = 0;
                } else if (anotherTry.equals("n")) {
                    break;
                }
            }   
        }
    }
}