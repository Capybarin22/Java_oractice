import java.util.Scanner;

class changeTwo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int countOfrecipe = input.nextInt();
        String[] recipe = {};
        for (int i = 0; i < countOfrecipe; i++) {
            recipe[i] = input.nextLine();
        }

        int countOfProducts = input.nextInt();
        String allergicAndNotAllergic = "";
        String[] allergic = {};
        String[] notAllergic = {};
        for (int i = 0; i < countOfProducts; i++) {
            allergicAndNotAllergic = input.nextLine();
            allergic[i] = allergicAndNotAllergic.substring(0, allergicAndNotAllergic.indexOf(" "));
            notAllergic[i] = allergicAndNotAllergic.substring(allergicAndNotAllergic.lastIndexOf(" "), allergicAndNotAllergic.length());
        }
        for (int i = 0; i < countOfrecipe; i++) {
            for (int j = 0; j < countOfProducts; j++) {
                recipe[i].replace(allergic[j], notAllergic[j]);
            }
        }
        for (int i = 0; i < countOfrecipe; i++) {
            System.out.print(recipe[i]);
        }
    }
}