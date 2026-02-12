package week04.geometry;

public class Main {
    public static void main() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(5, 16);

        p1.translate(15, 13);
        p2.translate(1, 1);

        System.out.println(p1.getX() + " " + p1.getY() + " " + p2.getX() + " " + p2.getY());
        System.out.println(p1.equals(p2));
        p2.setX(p1.getX());
        p2.setY(p1.getY());
        System.out.println(p1.equals(p2));

        p2.translate(13, 27);

        Segment s = new Segment(p1, p2);

        System.out.println(s.getP1().getX() + " " + s.getP1().getY());
        System.out.println(s.getP2().getX() + " " + s.getP2().getY());

        System.out.println(s.getSlope());
        System.out.println(s.getIntercept());

        Point p3 = new Point(p1.getX() * 2, p1.getY() * 2);
        System.out.println(s.isOnLine(p3));
    }
}