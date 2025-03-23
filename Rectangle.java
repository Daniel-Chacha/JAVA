public class Rectangle extends Shape{
    public void getArea(){
        float area = dimension1 * dimension2;

        System.out.println("Area of "+ name + " is "+ area);
    }
    public void sample(int x){
        System.out.println(x + " came from the subclass");
    }

}
