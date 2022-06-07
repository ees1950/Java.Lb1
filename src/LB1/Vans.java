package LB1;

public class Vans extends Kedi {
    private int shopper;

    @Override
    String getDescription() {
        return "This is Vans. " + "Type is " + this.getTypeKedi() + ". " + this.shopper +" Shopper" + ". Weight is " + this.getWeight() + "gr. Quality is " + this.getQuality() +
                ". Color is " + this.getColor() +  ". Convenience rating is " +getConvenience();
    }

    public Vans(int weight, int liked, int Quality, String color, String typeKedi, int Convenience, int shopper) {
        super(weight, liked, Quality, color, typeKedi, Convenience);
        this.shopper = shopper;
    }
}

