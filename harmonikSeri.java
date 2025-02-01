import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik serisisni bulmak istediğininiz sayiyi giriniz: ");
        sayi = input.nextInt();
        for (double i = 1; i <= sayi; i++) {
            toplam += 1/i;
        }
        System.out.println("Toplam: " + toplam);
    }
}
