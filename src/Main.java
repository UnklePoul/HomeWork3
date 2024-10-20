public class Main {
    public static void main(String[] args) {
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