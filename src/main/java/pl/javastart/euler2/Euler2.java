package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {

        Euler2 euler2 = new Euler2();
        int result = euler2.sumEvenFibNumBelow(4000000);
        System.out.println(result);
    }

    public int sumEvenFibNumBelow(int limit) {
        boolean sumBelow = false;
        int sum = 0;
        int evenSum = 2;
        int firstNumber = 1;
        int secondNumber = 2;
        while (!sumBelow) {
            if (sum <= limit) {
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
                if (sum % 2 == 0) {
                    evenSum += sum;
                }
            } else {
                sumBelow = true;
            }
        }
        return evenSum;
    }
}
