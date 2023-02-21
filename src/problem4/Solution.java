package problem4;
/*
     На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
Необходимо вывести на экран построчно сколько встретилось различных элементов. Каждая строка должна содержать количество элементов и сам элемент через пробел.
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
        for (int i = 0; i < n; i++) {
            ai[i] = con.nextInt();
        }
        int v = 0;
        int k = 0;
        for (int j = 0; j < n; j++) {
            v = ai[j];
            k = 1;
            for (int i = j + 1; i < n; i++) {
                if (v == ai[i]) {
                    k++;
                    j++;
                }
                else break;
            }
            System.out.println(k + " " + v);
        }
    }
}
