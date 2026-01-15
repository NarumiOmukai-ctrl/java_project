import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("年齢を入力してください: ");
        System.out.println("体重を入力してください。");
        int age = scanner.nextInt();
        System.out.println("あなたの年齢は " + age + " 歳です。");
        double weight = scanner.nextDouble();
        System.out.println("あなたの体重は " + weight + " kgです。");
        scanner.close();
    }
}
