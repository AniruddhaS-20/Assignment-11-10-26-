public class Number_verification {
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        int num = 145, sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        if (sum == num) System.out.println(num + " is a Strong Number.");
        else System.out.println(num + " is not a Strong Number.");
    }
}