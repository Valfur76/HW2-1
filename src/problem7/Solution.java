package problem7;
/*
     На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
Необходимо создать массив, полученный из исходного, возведением в квадрат каждого элемента, упорядочить элементы по возрастанию и вывести их на экран.
Ограничения:
    • 0 < N < 100
    • -1000 < ai < 1000
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int[] ai = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = con.nextInt();
            s[i] = ai[i] * ai[i];
        }
        int v;
        for (int j = n - 1; j > 0; j--) {
            for (int i = j; i > 0; i--) {
                for (int k = 1; k <= i; k++) {
                    if (s[i] < s[i - k]) {
                        v = s[i];
                        s[i] = s[i - k];
                        s[i - k] = v;
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(s[j] + " ");
        }
    }
}
