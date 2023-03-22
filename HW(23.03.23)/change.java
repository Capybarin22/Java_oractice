import java.util.Scanner;

class change {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String allergic = input.nextLine();
        String notAllergic = input.nextLine();
        String recipe = input.nextLine().toLowerCase();

        System.out.print(recipe.replace(allergic, notAllergic));
    }
}