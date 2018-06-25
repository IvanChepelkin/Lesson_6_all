package Circle;

public class Circle {
    private int x;
    private int y;
    private int radius;
    public double area;

    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 12);
        Circle circle2 = new Circle(3, 5, 12);

        circle1.getArea();
        circle2.getArea();
        circle1.infoCircle(circle1.getArea());
        circle2.infoCircle(circle2.getArea());
        circle1.compareArea(circle1.getArea(),circle2.getArea());

    }

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {

        area = this.getRadius() * this.getRadius() * Math.PI;

        return area;
    }

    public void infoCircle(double area){
        System.out.println("Площадь окружности "+area+" см²");
    }

    public void compareArea(double area1, double area2){
        if (area1 == area2){
            System.out.println("Площади окружностей равны");
        }
        else if (area1<area2){
            System.out.println("Площадь окружности 1 меньше площади окружности 2 ");
        }
        else if (area1>area2){
            System.out.println("Площадь окружности 1 больше площади окружности 2 ");
        }

    }
    

}
