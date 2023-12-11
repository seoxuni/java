/* Section 10, Practice 12 */

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        p1.move(1, 1);

        double distance = p1.distanceTo(p2);
        System.out.println(distance);
    }
    public static class Point {
        private int x;

        private int y;

        public Point(int x, int y) {
            this.x = x;  // Assigning x-coordinate of the point
            this.y = y;  // Assigning y-coordinate of the point
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void move(int dx, int dy) {
            this.x += dx;
            this.y += dy;
        }

        public double distanceTo(Point other) {
            int dx = other.x - this.x;
            int dy = other.y - this.y;

            return Math.sqrt(dx * dx + dy * dy);
        }
    }
}
