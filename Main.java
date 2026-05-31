package module_14.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nh?p v�o m?t s? nguy�n: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("L?i: S? nh?p v�o kh�ng h?p l? ?? ki?m tra s? nguy�n t? (ph?i l?n h?n 0).");
                return;
            }

            if (isPrime(number)) {
                System.out.println(number + " l� s? nguy�n t?.");
            } else {
                System.out.println(number + " kh�ng ph?i l� s? nguy�n t?.");
            }

        } catch (InputMismatchException e) {
            System.out.println("L?i: D? li?u nh?p v�o kh�ng ph?i l� s? nguy�n h?p l?.");
        } finally {
            scanner.close();
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
