public class Main {
    public static void main(String[] args) {

        int myInt = 10 ;
        byte myByte = 5 ;
        short myShort = 20 ;
        long myLong = 10000000L ;
        float myFloat = 10.2f ;
        double myDouble = 10.7  ;

        System.out.println(myInt);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        double a  = 27.12 ;
        long b = 987_678_965_549L ;
        float c = 2.786f ;
        int d = 569 ;
        short e = -159 ;
        int f  = 27897  ;
        byte g = 67 ;

        int studentOfClass1 = 23;
        int studentOfClass2 = 27;
        int studentOfClass3 = 30;
        int totalSheets = 480 ;
        int totalStudents = studentOfClass1 + studentOfClass2 + studentOfClass3 ;
        int sheetsPerStudent = totalSheets / totalStudents ;
        System.out.println(sheetsPerStudent);

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

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");

        int bananasCount = 5;
        int bananasWeight = 80;
        int milkVolume = 200;
        double iceCreamWeight = 2 * 100;
        int eggCount = 4 ;
        int eggWeight = 70 ;
        int totalWeight = bananasWeight * bananasCount + milkVolume * 105 / 100 + (int) iceCreamWeight + eggCount * eggWeight ;
        double totalWeightInKg = totalWeight / 1000.0;

        System.out .printf("Общий вес завтрака: %d грамм (%2f кг)",totalWeight, totalWeightInKg);



        int wiegtLossGoalKg = 7;
        double dailyWiegtLossLowKg = 0.25;
        double dailyWiegtLossHighKg = 0.5;

        int daysLow = (int) Math.ceil(wiegtLossGoalKg / dailyWiegtLossLowKg);
        int daysHigh = (int) Math.ceil(wiegtLossGoalKg / dailyWiegtLossHighKg);
        int daysAverge = (daysLow + daysHigh) / 2;
        System.out.println("Теряем в день: " + dailyWiegtLossLowKg + " нужно дней " + daysLow);
        System.out.println("Теряем в день: " + dailyWiegtLossHighKg + " нужно дней " + daysHigh);
        System.out.println("Среднее количестов дней: " + daysAverge);

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);

        int mashaSalaryBeforIndexatione = mashaSalary * 12;
        int denisSalaryBeforIndexatione = denisSalary * 12;
        int kristinaSalaryBeforIndexatione = kristinaSalary * 12;

        int mashaSalaryAfterIndexatione = mashaNewSalary * 12;
        int denisSalaryAfterIndexatione = denisNewSalary * 12;
        int kristinaSalaryAfterIndexatione = kristinaNewSalary * 12;

        System.out.println("Маша теперь получает "+mashaNewSalary+ "доход вырос на "+ (mashaSalaryAfterIndexatione-mashaSalaryBeforIndexatione));
        System.out.println("Денис теперь получает "+denisNewSalary+ "доход вырос на "+ (denisSalaryAfterIndexatione-denisSalaryBeforIndexatione));
        System.out.println("Кристина теперь получает "+kristinaNewSalary+ "доход вырос на "+ (kristinaSalaryAfterIndexatione-kristinaSalaryBeforIndexatione));

    }}