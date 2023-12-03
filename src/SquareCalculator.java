/* Section 10, Practice 11 */
public class Square {

    private int side;

    public Square(int side) {
        if (side <= 0) {
            this.side = -1;
        } else {
            this.side = side;
        }
    }

    public int calculateArea() {
        if (side <= 0) return -1;

        return this.side * this.side;
    }

    public int calculatePerimeter() {
        if (side <= 0) return -1;

        return 4 * this.side;
    }

}