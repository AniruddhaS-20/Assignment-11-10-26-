public class Second_largest {
    public static void main(String[] args) {
        int num = 985998;
        int count = 0, secondLargest = -1;

        for (int d = 9; d >= 0; d--) {
            int temp = num;
            boolean found = false;
            while (temp > 0) {
                if (temp % 10 == d) { found = true; break; }
                temp /= 10;
            }
            if (found && ++count == 2) {
                secondLargest = d;
                break;
            }
        }
        System.out.println("Second-largest distinct digit: " + secondLargest);
    }
}