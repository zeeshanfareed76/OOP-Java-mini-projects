
package Assignment;


public class Rectangle implements Shape {
    private int l;
    private int w;
    
    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }

    public double area() {
       return l*w;
    }

}
