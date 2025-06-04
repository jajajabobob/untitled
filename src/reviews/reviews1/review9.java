package reviews.reviews1;
import java.io.*;

public class review9 {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("名前を入力してください");
        String inputName = br.readLine();
        System.out.println("年齢を入力してください");
        int age = Integer.parseInt(br.readLine());
        System.out.println(age +"歳の" + inputName +"さん。");
        System.out.println("こんにちは");

    }
}
