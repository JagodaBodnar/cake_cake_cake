public class TasteTester {
    public static void main(String[] args) {
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(4);
        weddingCake.setFlavor("strawberry");
        weddingCake.setPrice(49.99);
        System.out.printf("You ordered wedding cake: %n flavor: %s%n tiers: %d%n price: $%.2f%n", weddingCake.getFlavor(), weddingCake.getTiers(), weddingCake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(13);
        birthdayCake.setFlavor("vanilla");
        birthdayCake.setPrice(39.99);
        System.out.printf("You ordered birthday cake: %n flavor: %s%n candles: %d%n price: $%.2f%n", birthdayCake.getFlavor(), birthdayCake.getCandles(), birthdayCake.getPrice());
    }
}
