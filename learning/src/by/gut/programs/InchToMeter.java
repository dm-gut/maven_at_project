package by.gut.programs;

class InchToMeter {
    public static void main(String[] args) {
        double meter;
        int inch, counter;

        counter = 0;
        for (inch = 1; inch <= 144; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " дюйм(-а, -ов) равны " + meter + " метрам(-ов)");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}