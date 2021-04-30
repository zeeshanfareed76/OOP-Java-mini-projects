
package lab09;

public class ClockChild extends Clock {
    ClockChild(int a, int b, int c){
    super( a, b,  c);
    }
    public void Display(){
    super.Display();
    if(hour>=1 && hour<=12){
        hour=hour%12;
        System.out.println("Current time:   " +hour+" : "+minute+" : "+second+" AM\n");
    }
    else if(hour>=12 && hour<=24){
        hour=hour%12;
        System.out.println("Current time:   " +hour+" : "+minute+" : "+second+" PM\n");
    }
    
    
    }
}