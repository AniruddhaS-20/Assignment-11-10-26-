public class Prime_factorization {
    public static void main(String[] args) {
        int n = 360;
        System.out.print("Prime factorization: ");
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) { count++; n /= i; }
            if (count > 0) System.out.print(i + "^" + count + " ");
        }
    }
}