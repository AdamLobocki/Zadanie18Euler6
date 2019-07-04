public class Euler6 {
    public static void main(String[] args) {
        Euler6 euler6 = new Euler6();
      int x =  euler6.calc(100);
        System.out.println(x);
    }

    int calc(int x) {
        int sumOfTheSquare = 0;
        int squareOfTheSum = 0;
        for (int i = 1; i <= x; i++) {
            sumOfTheSquare += i*i;
        }
        for (int i = 1; i <= x; i++) {
            squareOfTheSum += i;
        }
        squareOfTheSum *= squareOfTheSum;
        return squareOfTheSum - sumOfTheSquare;
    }


}
