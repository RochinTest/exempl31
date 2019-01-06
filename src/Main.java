import java.util.Scanner;

//). Вычислить сумму и число положительных элементов матрицы A[N, N], находящихся над главной диагональю.
public class Main {

    public static void main(String[] args) {
        int N = 0;
        int m = 0;
        System.out.println("Введите размер матричы NxN");
        Scanner sc = new Scanner(System.in);
        int n = 0;

        if (sc.hasNextInt()) {
            N = sc.nextInt();
            int[][] mass = new int[N][N];
            for (int i = 0; i < mass.length; i++) {
                System.out.println();
                for (int j = 0; j < mass.length; j++) {
                    mass[i][j] = (int) (Math.random() * 10);
                    if (mass[i][j] % 2 == 0) {
                    }
                    System.out.print(" " + mass[i][j]);
                }
            }
            System.out.println();
            for (int i = 0; i < mass.length; i++) {
                if (i < N - 1 && mass[i][i + 1] != 0 && mass[i][i + 1] % 2 == 0) {
                    m = m + mass[i][i + 1];
                    n++;
                }
            }
        }
        System.out.print("m= " + m + " n= " + n);
    }
}































