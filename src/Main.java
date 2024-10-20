public class Main {
    public static void main(String[] args) {
    int bananasCount = 5;
    int bananasWeight = 80;
    int milkVolume = 200;
    double iceCreamWeight = 2 * 100;
    int eggCount = 4 ;
    int eggWeight = 70 ;

    int totalWeight = bananasWeight * bananasCount + milkVolume * 105 / 100 + (int) iceCreamWeight + eggCount * eggWeight ;
    double totalWeightInKg = totalWeight / 1000.0;

    System.out .printf("Общий вес завтрака: %d грамм (%2f кг)",totalWeight, totalWeightInKg);
   }
}
