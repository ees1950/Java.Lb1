package LB1;

public class Nike extends Crosovki {
    private String modelName;

    @Override
    String getDescription() {
        return "This is Nike. My model is " + this.modelName + ". Quality is " + this.getQuality() + ". People liked " + this.getLiked() + ". Weight is "+ getWeight() + ".";

    }

    public Nike(int weight, int liked, int speed, int size, int gender, String color, String modelName) {
        super(weight, liked, speed, size, gender, color);
        this.modelName = modelName;
    }
}
