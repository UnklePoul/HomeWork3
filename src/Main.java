public class Main {
    public static void main(String[] args) {
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");

   }
}
