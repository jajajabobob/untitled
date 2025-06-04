package reviews.reviews1;

import java.util.Scanner;

public class review14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("信号の色を入力してください（赤・黄・青）: ");
        String color = scanner.nextLine();

        if (color.equals("赤")) {
            System.out.println("停止");
        } else if (color.equals("黄")) {
            System.out.println("注意");
        } else if (color.equals("青")) {
            System.out.println("進行");
        } else {
            System.out.println("無効な信号の色です");
        }

    }
}
