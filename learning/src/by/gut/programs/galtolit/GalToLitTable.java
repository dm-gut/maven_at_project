package by.gut.programs.galtolit;

class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litres;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответствует " + litres + " литра(-ов)");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}