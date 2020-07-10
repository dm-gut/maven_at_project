package by.gut.programs.primenumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 1;
        for (int x = 2, y = 2; x <= 100; ) {

            int z = x % y;

            if (z == 0) {
                if (x == y) {
                    System.out.println(i + ") " + x + " - простое число");
                    i++;
                }
                x++;
                y = 2;
            } else
                y++;
        }
    }
}
