package reviews.reviews1;
import java.util.Scanner;
public class review12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力してください: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 17) {
            System.out.println("未成年");
        } else if (age >= 18 && age <= 64) {
            System.out.println("成人");
        } else if (age >= 65) {
            System.out.println("高齢者");
        } else {
            System.out.println("無効な年齢です。");
        }

        scanner.close();
    }
}




