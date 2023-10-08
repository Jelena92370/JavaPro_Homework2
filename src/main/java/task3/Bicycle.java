package task3;

public class Bicycle {
    private String type;
    private String color;
    private int wheelSize;
    private boolean hasSuspension;
    private int maxVelocity;

    public Bicycle(String type, String color, int wheelSize, boolean hasSuspension, int maxVelocity) {
        this.type = type;
        this.color = color;
        this.wheelSize = wheelSize;
        this.hasSuspension = hasSuspension;
        this.maxVelocity = maxVelocity;
    }
    @Override
    public String toString() {
        return "Bicycle{" +
                "type = '" + type + '\'' +
                ", color = '" + color + '\'' +
                ", wheelSize = " + wheelSize +
                ", hasSuspension = " + hasSuspension +
                ", maxVelocity = " + maxVelocity +
                '}';
    }
}
