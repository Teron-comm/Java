public class lab4z3 {
 public static void main(String[] args) {

        Point p = new Point(3, 4);
        System.out.println("Point: " + p);
        System.out.println("Distance from origin: " + p.distanceFromOrigin());
        Point firstRectanglePoint = new Point(0, 0);
        Point secontRectingePoint = new Point(10, 10);
        boolean inRect = p.isInRectangle(firstRectanglePoint,secontRectingePoint);
        System.out.println("In rectangle: " + inRect);
        Point c = new Point(3, 4);
        boolean inCirc = p.isInCircle(c, 5);
        System.out.println("In circle: " + inCirc);
        System.out.println("");


        Point3D Point_3D = new Point3D(3, 4, 5);
        System.out.println("Point3D: " + Point_3D);
        System.out.println("Distance from origin: " + Point_3D.distanceFromOrigin());
        Point3D b1 = new Point3D(3, 4, 5);
        Point3D b2 = new Point3D(10, 10, 10);
        boolean inBox = Point_3D.isInBox(b1, b2);
        System.out.println("In box: " + inBox);
        Point3D sc = new Point3D(3, 4, 5);
        boolean inSph = Point_3D.isInSphere(sc, 8);
        System.out.println("In sphere: " + inSph);

    }

}

