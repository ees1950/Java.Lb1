package LB1;

abstract class Kedi extends Shoes {
    private String typeKedi;
    private int Convenience;

    @Override
    String getDescription() {
        return "This is Vans Shoes class.";
    }

    public Kedi(int weight, int liked, int Quality, String color, String typeKedi, int Convenience) {
        super(weight, liked, Quality, color);
        this.typeKedi = typeKedi;
        this.Convenience = Convenience;
    }

    public String getTypeKedi() {
        return typeKedi;
    }


    public int getConvenience() {
        return Convenience;
    }

}
