public class Main {
    public static void main(String[] args) {
        int bottlesInMinute = 16;
        int minutesInDay = 24*60;
        int minutesInThreeDays = 3*minutesInDay;
        int minutesInMonth = 30*minutesInDay ;

        int bottelesIn20Minute = bottlesInMinute * 20 ;
        int bottelesInDay = bottlesInMinute * minutesInDay;
        int bottelsIn3Days = bottlesInMinute * minutesInThreeDays;
        int bottelsInMonth = bottlesInMinute * minutesInMonth;

        System.out.println("за 20 минут " +bottelesIn20Minute);
        System.out.println("за день "+bottelesInDay);
        System.out.println("За 3 дня "+bottelsIn3Days);
        System.out.println("за месяц "+bottelsInMonth);
   }
}
