
package Assignment.task1;

public class geoShape implements Shape{
     private int l;
    private int w;
    
    geoShape(int l,int w){
        this.l=l;
        this.w=w;
    }

     @Override
    public double area() {
       return l*w;
    }

}

    
