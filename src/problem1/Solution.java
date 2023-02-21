package problem1;
import java.util.Scanner;
/*
     На вход подается число N — длина массива. Затем передается массив вещественных чисел (ai) из N элементов.
Необходимо реализовать метод, который принимает на вход полученный массив и возвращает среднее арифметическое всех чисел массива.
Вывести среднее арифметическое на экран.
Ограничения:
    • 0 < N < 100
    • 0 < ai < 1000
 */
public class Solution {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        double[] ai = new double[n];
        double s = 0;
        for (int i = 0; i < n; i++) {
            ai[i] = con.nextDouble();
            s += ai[i];
        }
        System.out.println(s/n);
    }
}