package entities;

public class Checker {
	
	public static boolean isFibonacci(int n) {

        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == n;
	}
}
