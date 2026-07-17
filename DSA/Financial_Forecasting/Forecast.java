public class Forecast {
    public static double calculate(double amount, double rate, int year) {

        if (year == 0) {
            return amount;
        }

        amount = amount + (amount * rate);

        return calculate(amount, rate, year - 1);
    }
    public static void main(String[] args) {

        double amount = 70000;
        double rate = 0.09;   
        int year = 15;

        double future = calculate(amount, rate, year);

        System.out.println("Initial Amount : " + amount);
        System.out.println("Growth Rate : " + (rate * 100) + "%");
        System.out.println("Years : " + year);
        System.out.println("Future Amount : " + future);
    }
}