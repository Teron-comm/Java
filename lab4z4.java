public class lab4z4 {

    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(10, 20);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Distance: " + p1.distanceFromOrigin());

        System.out.println();

        Point mid = p1.getMidpoint(p2);
        System.out.println("Midpoint: " + mid);


        Point3D p3 = new Point3D(1, 1, 1);
        Point3D p4 = new Point3D(10, 20, 30);

        System.out.println("Point 1: " + p3);
        System.out.println("Point 2: " + p4);
        System.out.println("Distance: " + p3.distanceFromOrigin());

        System.out.println();

        Point3D mid3d = p3.getMidpoint(p4);
        System.out.println("Midpoint: " + mid3d);

    }

}
