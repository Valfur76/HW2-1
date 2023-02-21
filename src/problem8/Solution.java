package problem8;
/*
     На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов. После этого передается число M.
Необходимо найти в массиве число, максимально близкое к M (т.е. такое число, для которого |ai - M| минимальное). Если их несколько, то вывести максимальное число.
Ограничения:
    • 0 < N < 100
    • -1000 < ai < 1000
    • -1000 < M < 1000
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
        int min = Math.abs(ai[0] - m);
        int i = 0;
        int d;
        for (int j = 1; j < n; j++) {
            d = Math.abs(ai[j] - m);
            if (d <= min) {
                i = j;
                min = d;
            }
        }
        System.out.println(ai[i]);
    }
}
