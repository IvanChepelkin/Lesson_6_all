package Circle;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private double area;

    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 12);
        Circle circle2 = new Circle(3, 5, 11);

        circle1.infoCircle(circle1.getArea());
        circle2.infoCircle(circle2.getArea());
        circle1.compareArea(circle1.getArea(),circle2.getArea());

        circle1.findIntersection(circle1.getX(),circle2.getX(),circle1.getY(),circle2.getY(),
                circle1.getRadius(),circle2.getRadius());


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

    public void findIntersection(int x1,int x2,int y1,int y2,int radius1,int radius2){

        double d = Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)));
        System.out.println("Расстояние между центрами окружностей "+ d);
        if(radius1+radius2 > d){
            System.out.println("Окружности не пересекаются ");
        }
        else if (radius1+radius2 < d){
            System.out.println("Окружности пересекаются ");
        }
        else if (radius1+radius2 == d){
            if (radius1>radius2){
                System.out.println("Окружность 2 вписана в окружность 1 ");
            }
            else if (radius1<radius2){
                System.out.println("Окружность 1 вписана в окружность 2 ");
            }
        }
    }



}
