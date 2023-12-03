public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        this.feet = inches / 12;
        this.inches = inches % 12;

        if (inches < 0) {
            this.feet = -1;
            this.inches = -1;
        }
    }

    public int getFeet() {
        return this.feet;
    }

    public int getInches() {
        return this.inches;
    }
}