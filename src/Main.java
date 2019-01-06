import java.util.Scanner;

//Дана матрица А размером п х т. Определить k – количество особых
// элементов массива А, считая его элемент особым, если он больше
// суммы остальных элементов его столбца.
public class Main {

    public static void main(String[] args) {
        int N = 0;
        //int m = 0;
        System.out.println("Введите размер матричы nxt");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            N = sc.nextInt();
            int[] m = new int[N];
            int[][] mass = new int[N][N];
            // int m[N]=0;
            for (int i = 0; i < mass.length; i++) {
                System.out.println();
                for (int j = 0; j < mass.length; j++) {
                    mass[i][j] = (int) (Math.random() * 100);
                    System.out.print(" " + mass[i][j]);
                }
            }
            System.out.println();
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass.length; j++) {
                    m[i] = m[i] + mass[j][i];
                }
            }
            System.out.println();
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass.length; j++) {

                    if (mass[j][i] > (m[i] - mass[j][i])) {
                        n++;
                    }
                }
            }
        }
        System.out.print("Особых элементов массива " + n);
    }
}































