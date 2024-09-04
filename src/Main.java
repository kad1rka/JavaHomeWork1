import javax.swing.plaf.synth.SynthStyleFactory;
import java.sql.PseudoColumnUsage;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isPalindrome(int num) {

        int originalNumber = num;
        int reversedNumber = 0;


        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
    public static boolean isVowel(char ch) {
        return "aeiouyаеёиоуыэюя".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        // Задача 1: Четное или нечетное число
//        Scanner scanner  = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("Число является четным.");
//
//        } else {
//            System.out.println("Число не является четным.");
//        }


        // Задача 2: Минимальное из трех чисел
//        Scanner scanner  = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Введите второе число: ");
//        int num2 = scanner.nextInt();
//        System.out.print("Введите третье число: ");
//        int num3 = scanner.nextInt();
//
//        if (num1 < num2 & num1 < num3) {
//
//        System.out.println("Минмальное из трех чисел - " + num1);
//        }
//        else if (num2 < num1 & num2 < num3) {
//
//            System.out.println("Минмальное из трех чисел - " + num2);
//        } else if
//        (num3 < num1 & num3 < num2) {
//                System.out.println("Минмальное из трех чисел - " + num3);
//        }


        // Задача 3: Таблица умножения

//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(i + " * " + " 5 " + " = " + i*5);
//        }

        // Задача 4: Сумма чисел от 1 до N

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int N = in.nextInt();
//        int Sum = 0;
//        for (int i = 0; i<=N; i++)
//            Sum+=i;
//       System.out.print("Сумма чисел от 1 до N: " + Sum);

        // Задача 5: Число Фибоначчи

//        int num0 = 0;
//        int num1 = 1;
//        int num2;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число N: ");
//        int N = scanner.nextInt();
//
//        System.out.print(num0 + " " + num1 + " ");
//        for(int i = 3; i <= N; i++){
//            num2 = num0 + num1;
//            System.out.print(num2 + " ");
//            num0 = num1;
//            num1 = num2;
//        }


        // Задача 6: Проверка простого числа

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int Number = scanner.nextInt();
//        int counter = 0;
//        for (int i = 1; i <= Number; i++) {
//            if (Number % i == 0) {
//                counter++;
//            }
//        }
//        if (counter == 2) {
//            System.out.println("Число является простым.");
//
//        } else {
//            System.out.println("Число не является простым.");
//        }

        // Задача 7: Обратный порядок чисел

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int N = scanner.nextInt();
//        for (int  i = N ; i >= 1; i--) {
//            System.out.println(i);
//        }

        // Задача 8: Сумма четных чисел

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число А: ");
//        int A = scanner.nextInt();
//        System.out.println("Введите число В: ");
//        int B = scanner.nextInt();
//        int sum = 0;
//        for (int i = A; i <= B; i++) {
//            if (i % 2 == 0) {
//                sum+= i;
//            }
//        }
//        System.out.println("Сумма четных чисел = " + sum);


        // Задача 9: Реверс строки

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        char[] str = scanner.nextLine().toCharArray();
//        for (int i = str.length-1; i >= 0; i--) {
//            System.out.print(str[i]);
//        }

        // Задача 10: Количество цифр в числе

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//
//        int count = 0;
//        char[] str = scanner.nextLine().toCharArray();
//        for (int i = 0; i < str.length; i++) {
//          if (Character.isDigit(str[i])) {
//              count++;
//          }
//        }
//        System.out.println("Число содержит " + count + " цифр.");

        // Задача 11: Факториал числа

//        Scanner scanner  = new Scanner(System.in);
//        System.out.println("Введите число N: ");
//
//        int N = scanner.nextInt();
//        int F = 1;
//        for (int i = 1; i <= N; i++) {
//            F*= i;
//        }
//        System.out.println("Факториал числа = "+F);

        // Задача 12: Сумма цифр числа

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//
//        int sum = 0;
//        char[] str = scanner.nextLine().toCharArray();
//        for (int i = 0; i < str.length; i++) {
//          if (Character.isDigit(str[i])) {
//              sum+= Integer.parseInt(String.valueOf(str[i]));
//          }
//        }
//        System.out.println("Сумма цифр в числе = " + sum);

        // Задача 13: Палиндром

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//
//        if (isPalindrome(number)) {
//            System.out.println(number + " является палиндромом.");
//        } else {
//            System.out.println(number + " не является палиндромом.");
//        }

        // Задача 14: Найти максимальное число в массиве

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите размер массива: ");
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите элемент массива: ");
//            array[i] = scanner.nextInt();
//        }
//        int max = array[1];
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное число в массиве: "+  max);


        // Задача 15: Сумма всех элементов массива

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите размер массива: ");
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите элемент массива: ");
//            array[i] = scanner.nextInt();
//            sum+= array[i];
//        }
//        System.out.println("Сумма элементов массива:  " + sum);


        // Задача 16: Количество положительных и отрицательных чисел

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите размер массива: ");
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//        int CountNegatives = 0;
//        int CountPositives = 0;
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите элемент массива: ");
//            array[i] = scanner.nextInt();
//            if (array[i] > 0) {
//                CountPositives++;
//            } else if (array[i] < 0) {
//                CountNegatives++;
//            }
//        }
//
//        System.out.println("Количество положительных чисел: " + CountPositives );
//        System.out.println("Количество отрицательных чисел: " + CountNegatives);

        // Задача 17: Простые числа в диапазоне

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число А: ");
//        int A = scanner.nextInt();
//        System.out.println("Введите число В: ");
//        int B = scanner.nextInt();
//
//        int counter = 0;
//        for(int j = A; j <= B; j++) {
//
//            for (int i = 1; i <= j; i++) {
//                if (j % i == 0) {
//                    counter++;
//                }
//            }
//            if (counter == 2) {
//                System.out.println(j);
//            }
//            counter = 0;
//        }

        // Задача 18: Подсчет гласных и согласных в строке


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//
//        int vowelCount = 0;
//        int consonantCount = 0;
//
//        input = input.toLowerCase();
//
//        for (char ch : input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if (isVowel(ch)) {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }
//
//        System.out.println("Количество гласных: " + vowelCount);
//        System.out.println("Количество согласных: " + consonantCount);

        // Задача 19: Перестановка слов в строке
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите строку: ");
//
//        String[] Words = scanner.nextLine().split(" ");
//
//        for (int i = Words.length-1; i >= 0; i--) {
//            System.out.print(Words[i]+ " ");
//        }


        // Задача 20: Число Армстронга
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int sum = 0;
//        int digits = String.valueOf(number).length();
//        while (number > 0) {
//            int digit = number % 10;
//            sum += Math.pow(digit, digits);
//            number /= 10;
//        }
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " является числом Армстронга.");
//        } else {
//            System.out.println(originalNumber + " не является числом Армстронга.");
//        }

    }
}