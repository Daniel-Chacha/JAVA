public  class Triangle extends Shape implements Sample{
    public void getArea(){
        float area = 0.5f * dimension1 * dimension2;

        System.out.println("The area of " + name + " is " + area);
    }

    public void test(int x){};
}
