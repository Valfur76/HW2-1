package problem_extra1;
/*
     Создать программу генерирующую пароль.
На вход подается число N — длина желаемого пароля.
Необходимо проверить, что N >= 8, иначе вывести на экран "Пароль с N количеством символов небезопасен" (подставить вместо N число) и предложить пользователю еще раз ввести число N.

Если N >= 8, то сгенерировать пароль, удовлетворяющий условиям ниже и вывести его на экран. В пароле должны быть:
    • заглавные латинские символы
    • строчные латинские символы
    • числа
    • специальные знаки(_*-)
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        Random stochasticGenerator = new Random();
        char[] symbols = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', '*', '-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int n = 0;
        char ch = '0';

        do {
            n = con.nextInt();
            if (n < 8) System.out.println("Пароль с " + n + " количеством символов небезопасен. Введите число символов.");
        } while (n < 8);
        for (int i = 0; i < n; i++) {
            ch = symbols[stochasticGenerator.nextInt(60)];
            System.out.print(ch);
        }
    }
}
