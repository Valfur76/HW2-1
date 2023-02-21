package problem3;
/*
     На вход подается число N — длина массива.
     Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
     После этого вводится число X — элемент, который нужно добавить в массив, чтобы сортировка в массиве сохранилась.
Необходимо вывести на экран индекс элемента массива, куда нужно добавить X. Если в массиве уже есть число равное X, то X нужно поставить после уже существующего.
Ограничения:
    • 0 < N < 100
    • -1000 < ai < 1000
    • -1000 < X < 1000
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
        int x = con.nextInt();
        for (int j = n - 1; j >= 0; j--) {
            if (ai[j] <= x) {
                System.out.println(j + 1);
                break;
            }
        }

    }
}
