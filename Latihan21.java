import java.util.Scanner;
public class Latihan21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah Angka : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Masukan " + n + " Angka");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
    }
    System.out.println("Nilai Terbesar Adalah " + max);
    scanner.close();
}
}