package week04.geometry;

public class Segment {
    private Point p1 = new Point();
    private Point p2 = new Point();

    public Segment(Point p1, Point p2) {
        this.p1.setX(p1.getX());
        this.p2.setX(p2.getX());
        this.p1.setY(p1.getY());
        this.p2.setY(p2.getY());
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1.setX(x1);
        this.p1.setY(y1);
        this.p2.setX(x2);
        this.p2.setY(y2);
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(this.p2);
    }

    public boolean equals(Segment s) {
        if (this.p1.equals(s.p1) && this.p2.equals(s.p2)) return true;
        return false;
    }

    public float getSlope() {
        float dY = this.p2.getY() - this.p1.getY();
        float dX = this.p2.getX() - this.p1.getX();

        if (dX == 0) {
            System.out.println("The line is a vertical line. Returning infinity.");
        }

        return dY/dX;
    }

    public float getIntercept() {
        float dX = this.p2.getX() - this.p1.getX();
        if (dX == 0) {
            System.out.println("The line is a vertical line. Intercept does not exist. Returning infinity.");
            return 1/dX;
        }
        return (this.p1.getY() - this.getSlope()*this.p1.getX());
    }

    public boolean isOnLine(Point p) {
        if (p.getY() == this.getSlope()*p.getX() + this.getIntercept()) return true;
        return false;
    }

    public boolean isOnSegment(Point p) {
        float pY = p.getY();
        float pX = p.getX();
        float minY = Math.min(this.p1.getY(), this.p2.getY());
        float maxY = Math.max(this.p1.getY(), this.p2.getY());
        float minX = Math.min(this.p1.getX(), this.p2.getX());
        float maxX = Math.max(this.p1.getX(), this.p2.getX());

        if (this.isOnLine(p) && minX <= pX && pX <= maxX && minY <= pY && pY <= maxY) return true;
        return false;
    }
}
