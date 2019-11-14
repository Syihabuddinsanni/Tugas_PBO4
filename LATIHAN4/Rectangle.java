package LATIHAN4;

   public class Rectangle extends Shape {
    private int length;
    private int width;
    
    public Rectangle(String color, int legth, int width) {
        super(color);
        this.length =length;
        this.width = width;
    }
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }
    
    public double getArea() {
        return length*width;
    }
    
}
