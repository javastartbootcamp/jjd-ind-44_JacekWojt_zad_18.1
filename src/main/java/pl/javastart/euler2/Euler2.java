package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {

        Euler2 euler2 = new Euler2();
        int result = euler2.sumEvenFibNumBelow(1);
        System.out.println(result);
    }

    public int sumEvenFibNumBelow(int limit) {
        boolean sumBelow = false;
        int evenSum = 0;
        int firstNumber = 1;
        int secondNumber = 2;
        while (!sumBelow) {
            if (firstNumber <= limit) {
                if (firstNumber % 2 == 0) {
                    evenSum += firstNumber;
                }
                int tmp = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = tmp;
            } else {
                sumBelow = true;
            }
        }
        return evenSum;
    }
}
