
package Assignment;

public class Runner {
    
    public static void main(String[] args) {
        Shape[] obj;
        obj=new Shape[6];
        obj[0]=new Rectangle(15,65);
        obj[1]=new Rectangle(15,14);
        obj[2]=new Circle(6);
        obj[3]=new Circle(4.5);
        obj[4]=new Triangle(5,10);
        obj[5]=new Triangle(6,4);
        
        double[] arr;
        arr = CalculateAreas.Area(obj);
        System.out.println("Area of All Shapes is as Follow:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" Square unit");
        }
    }
    
}
