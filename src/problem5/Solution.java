package problem5;
/*
     На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов.
     После этого передается число M — величина сдвига.
Необходимо циклически сдвинуть элементы массива на M элементов вправо.
Ограничения:
    • 0 < N < 100
    • -1000 < ai < 1000
    • 0 <= M < 100
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = con.nextInt();
        }
        int m = con.nextInt();
        int k = 0;
        for (int j = 0; j < n; j++) {
            k = (n - m + j) < n ? n - m + j: -m + j;
            System.out.print(ai[k] + " ");
        }
    }
}
