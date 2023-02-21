package problem2;
/*
     На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов. После этого аналогично передается второй массив (aj) длины M.
Необходимо вывести на экран true, если два массива одинаковы (то есть содержат одинаковое количество элементов и для каждого i == j элемент ai == aj). Иначе вывести false.
Ограничения:
    • 0 < N < 100
    • 0 < ai < 1000
    • 0 < M < 100
    • 0 < aj < 1000
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
        int[] aj = new int[n];
        for (int j = 0; j < n; j++) {
            aj[j] = con.nextInt();
        }
        if (n == m) {
            boolean b = false;
            for (int i = 0; i < n; i++) {
                if (ai[i] == aj[i]) {
                    b = true;
                    continue;
                }
                else {
                    b = false;
                    break;
                }
            }
            System.out.println(b);
        }
        else System.out.println(false);
    }
}
