public class Armstrong_number {
    static int countDigits(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    static int power(int b, int e) {
        int res = 1;
        for (int i = 0; i < e; i++) res *= b;
        return res;
    }

    public static void main(String[] args) {
        System.out.print("Armstrong numbers: ");
        for (int i = 1; i <= 500; i++) {
            int sum = 0, temp = i, digits = countDigits(i);
            while (temp > 0) {
                sum += power(temp % 10, digits);
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}