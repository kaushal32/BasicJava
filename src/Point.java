public class Point {
    private int x,y;
    public Point()
    {
        System.out.println("Non parameterized constructor");
    }
    Point(int x, int y)
    {
        System.out.println("Value of x and y are" + x + " "+ y);
    }
    public void setX(int x)
    {
        System.out.println("Value of x is" +x);
    }
    public void setY(int y)
    {
        System.out.println("Value of y is"+y);
    }
    public void setXY(int x, int y)
    {
        System.out.println("Value of x and y are"+x +" "+ y);
    }
}
class PointMain
{
    public static void main(String[] args) {
        Point obj = new Point();
        Point obj1 = new Point(10,15);
        obj.setX(10);
        obj.setY(15);
        obj.setXY(10,15);
    }
}