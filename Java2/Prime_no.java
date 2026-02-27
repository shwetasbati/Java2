public class Prime_no {
    public static void main(String[] args) {
        int n = 8;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {   // check from 2 to n-1
                if (n % i == 0) {
                    isPrime = false;
                    break;   // stop when factor is found
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is prime: " + n);
        } else {
            System.out.println("The number is not prime: " + n);
        }
    }
}