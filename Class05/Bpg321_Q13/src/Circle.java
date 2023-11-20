public class Circle implements Shape {
    public double dRad = 0.0;

    Circle(){
        this(1.0);
    }

    Circle(double dRad){
        this.dRad = dRad ;
    }

    public void draw(){
        System.out.printf("반지름 %.2f인 원입니다.\n", dRad );
    }

    public double getArea() {
        double dRes = 0.0;
        dRes = dRad * dRad * PI ;
        
        return dRes;
    }

    public static void main(String[] args) {
        Shape donut = new Circle(10.0);

        donut.redraw();

        System.out.println("면적은 " +  donut.getArea());
    }
    
}
