public class Point {

    public int x;
    public int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }

    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        if (x < topLeft.x || x > bottomRight.x) {
            return false;
        }
        if (y < topLeft.y || y > bottomRight.y) {
            return false;
        }
        return true;
    }

    public boolean isInCircle(Point center, int radius) {
        int dx = x - center.x;
        int dy = y - center.y;
        int dist = dx * dx + dy * dy;
        if (dist <= radius * radius) {
            return true;
        }
        return false;
    }

    public int distanceFromOrigin() {
        int dist = (int) Math.sqrt(x * x + y * y);
        return dist;
    }

    public Point getMidpoint(Point other) {
        int midX = (this.x + other.x) / 2;
        int midY = (this.y + other.y) / 2;
        return new Point(midX, midY);
    }

}
