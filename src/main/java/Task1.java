//Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String strNum = iScanner.nextLine();

        int intNum = Integer.parseInt(strNum);

        System.out.println(triangleNumber(intNum));
    }

    public static int triangleNumber(int num) {

        if (num >= 0) return ((num * (num + 1)) / 2);

        return triangleNumber(num - 1);
    }

}

