
package lab8;
public class Computer {
    
int wordSize;
int memorySize;
int storageSize;
double speed;

public Computer(){
    this.wordSize=4;
    this.storageSize=250;
    this.memorySize=4;
    this.speed=4;
    }

public Computer(int wordSize,int memorySize, int storageSize, int speed ){
this.wordSize=wordSize;
this.memorySize=memorySize;
this.storageSize=storageSize;
this.speed=speed;
}

public void Display(){
    System.out.println("Wordsize: "+wordSize+"bits\nMemorySize: "+memorySize+ "MB\nStorage Size: "+
           +storageSize+"MB\nSpeed: "+speed+"Mhz");
}

    
}