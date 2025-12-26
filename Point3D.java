public class Point3D extends Point {

    private int z;

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;

    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";

    }

    public int distanceFromOrigin() {
        int dist = (int) Math.sqrt(getX() * getX() + getY() * getY() + z * z);
        return dist;
    }

    public Point3D getMidpoint(Point3D other) {
        int midX = (this.getX() + other.getX()) / 2;
        int midY = (this.getY() + other.getY()) / 2;
        int midZ = (this.z + other.z) / 2;
        return new Point3D(midX, midY, midZ);
    }

   public boolean isInBox(Point3D corner1, Point3D corner2) {
        if (x < corner1.x || x > corner2.x) {
            return false;
        }
        if (y < corner1.y || y > corner2.y) {
            return false;
        }
        if (z < corner1.z || z > corner2.z) {
            return false;
        }
        return true;
    }

    public boolean isInSphere(Point3D center, int radius) {
        int dx = x - center.x;
        int dy = y - center.y;
        int dz = z - center.z;
        int dist = dx * dx + dy * dy + dz * dz;
        if (dist <= radius * radius) {
            return true;
        }
        return false;
    }

}
