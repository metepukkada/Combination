import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kümeniz Kaç Sayı Olacak?: ");
        int combination, totalfark = 1, totaln = 1, totalr = 1, n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }
        System.out.print("Kümeniz Kaç Elemanlı Kümelere Dönüştürülsün?: ");
        int r = input.nextInt();
        for (int z = 1; z <= r; z++) {
            totalr *= z;
        }
        for (int y = 1; y <= n - r; y++) {
            totalfark *= y;
        }

        if (n >= r && r >= 0) {
            combination = totaln / (totalr * totalfark);
            System.out.println(n + " Sayısının " + r + " Sayılı Kombinasyonu = " + combination);
        }else{
            System.out.println("n ≥ r ≥ 0 Olmalıdır! ");
        }
    }
}
