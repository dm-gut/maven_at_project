package by.gut.programs.primenumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 1;
        for (int x = 1, y = 2; x <= 100; ) {
            x++;

            if (x <= (y * y - 1)) {
                System.out.println(i + ") " + x + " - простое число");
                i++;
                y = 2;
            } else {
                int z = x % y;
                if (z == 0 & x == y) {
                    System.out.println(i + ") " + x + " - простое число");
                    i++;
                    y = 2;
                } else {
                    y++;
                }
            }
        }
    }
}