
package lab8;

public class Laptop  extends Computer{
    int length;
    int width;
    int height;
    double weight;
    
public Laptop(){
    length=1;
    width=1;
    height=1;
    weight=1;
    }
    
    public Laptop(int l, int w , int h , double weight ,int wordSize,int memorySize, int storageSize, int speed){
    super(wordSize,memorySize,memorySize,speed);
    this.length=l;    
    this.width=w;
    this.height=h;
    this.weight=weight;

    }
    
    public void Display(){
        System.out.println("\n\t\tLaptop Specs");
    super.Display();
        System.out.println("Length: "+length +"cm \nWidth:  "+width+"cm\nHeight: "+height+"cm\nWeight: "+weight+"kg");
    }
}
