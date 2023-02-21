package problem10;
/*
Необходимо реализовать игру. Алгоритм игры должен быть записан в отдельном методе. В методе main должен быть только вызов метода с алгоритмом игры.

Условия следующие:
Компьютер «загадывает» (с помощью генератора случайных чисел) целое число M в промежутке от 0 до 1000 включительно.
Затем предлагает пользователю угадать это число. Пользователь вводит число с клавиатуры.
Если пользователь угадал число M, то вывести на экран "Победа!".
Если введенное пользователем число меньше M, то вывести на экран "Это число меньше загаданного."
Если введенное число больше, то вывести "Это число больше загаданного."
Продолжать игру до тех пор, пока число не будет отгадано или пока не будет введено любое отрицательное число.
 */
import java.util.Random;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        play();
    }

    static private void play() {
        Scanner con = new Scanner(System.in);
        Random stochasticGenerator = new Random();
        int randomNumber = 0;
        int m = con.nextInt();
        boolean isWin = false;
        do {
            randomNumber = stochasticGenerator.nextInt(1000);
            System.out.println(randomNumber);
            if (randomNumber == m) {
                isWin = true;
                System.out.println("Победа!");
            } else if (randomNumber > m) {
                System.out.println("Это число меньше загаданного.");
            } else System.out.println("Это число больше загаданного.");
            m = con.nextInt();
        } while (m >= 0 && isWin != true);
    }
}
