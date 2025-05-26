package reviews.reviews8;

public class reviews8 {
    public static void main(String[] args) {
        int a = 10;
        double b;
        // 明示的な型変換（キャスト）
        b = (double) a;
        a = (int) b; // 修正：double から int に変換

        a = (int) 10000L; // 修正：明示的なキャストを追加
        b = (double) 10000L; // 修正：明示的なキャストを追加

        float f = 5.94f; // 修正：float の値には 'f' を付ける必要がある
        short s = 10; // 問題なし
    }
}
