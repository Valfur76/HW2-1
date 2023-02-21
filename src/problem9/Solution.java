package problem9;
/*
     На вход подается число N — длина массива. Затем передается массив строк из N элементов (разделение через перевод строки).
     Каждая строка содержит только строчные символы латинского алфавита.
Необходимо найти и вывести дубликат на экран. Гарантируется что он есть и только один.
Ограничения:
    • 0 < N < 100
    • 0 < ai.length() < 1000
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        con.nextLine();
        String[] ai = new String[n];
        for (int i = 0; i < n; i++) {
            ai[i] = con.nextLine();
        }
        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i < n; i++) {
                if (ai[j].equals(ai[i])) System.out.println(ai[j]);
            }
        }
    }
}
