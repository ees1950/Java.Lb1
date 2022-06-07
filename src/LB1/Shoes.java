package LB1;

abstract class Shoes {
    private int weight;
    private int liked;
    private int quality;
    private String color;

    String getDescription() {
        return "This is Shoes class.";
    }

    public Shoes(int weight, int liked, int quality, String color) {
        this.weight = weight;
        this.liked = liked;
        this.quality = quality;
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public int getQuality() {
        return quality;
    }

    public int getWeight() {
        return weight;
    }

    public int getLiked() {return liked;
    }
}
