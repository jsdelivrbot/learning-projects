package examples;

public class OpAssign {
    public static void main(String[] args) {
        int numPeople = 11;
        float flight = 575.0F;
        float hotel = 876.35F;
        float carRental = 135.50F;
        float tripPrice = 0F;

        tripPrice += flight;
        tripPrice += hotel;
        tripPrice += carRental;

        System.out.println("Cost per person: $" + tripPrice);

        tripPrice *= numPeople;
        System.out.println("Total cost: $" + tripPrice);
    }
}
