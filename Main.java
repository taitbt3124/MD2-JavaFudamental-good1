import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.stdin);

        try {
            System.out.print("Nhập vào một số nguyên: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Lỗi: Số nhập vào không hợp lệ để kiểm tra số nguyên tố (phải lớn hơn 0).");
                return;
            }

            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không phải là số nguyên tố.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Dữ liệu nhập vào không phải là số nguyên hợp lệ.");
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
