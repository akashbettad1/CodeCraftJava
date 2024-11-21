package codingpractices;

public class PrimeNumberCheck {

    public boolean isPrimeNumber(Integer num) {

        boolean result = true;

        if (num == 0 || num == 1 ) {
            result = false;
        }

        if (num == 2) {
            result = true;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                result = false;
            }
        }

        return result;
    }

    public static void main (String[] args) {
        PrimeNumberCheck obj = new PrimeNumberCheck();
        System.out.println(obj.isPrimeNumber(7));
        System.out.println(obj.isPrimeNumber(13));
        System.out.println(obj.isPrimeNumber(200));
    }
}
