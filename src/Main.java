public class Main {
    public static void main(String[] args) {
        int wiegtLossGoalKg = 7;
        double dailyWiegtLossLowKg = 0.25;
        double dailyWiegtLossHighKg = 0.5;

        int daysLow = (int) Math.ceil(wiegtLossGoalKg / dailyWiegtLossLowKg);
        int daysHigh = (int) Math.ceil(wiegtLossGoalKg / dailyWiegtLossHighKg);
        int daysAverge = (daysLow + daysHigh) / 2;

        System.out.println("Теряем в день: " + dailyWiegtLossLowKg + " нужно дней " + daysLow);
        System.out.println("Теряем в день: " + dailyWiegtLossHighKg + " нужно дней " + daysHigh);
        System.out.println("Среднее количестов дней: " + daysAverge);

    }}