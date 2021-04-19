
package lab8;

public class Tape extends Publication{
 private int time;  

    public Tape(String title, double price, int timeInMinute) {
        super(title, price);
        time=timeInMinute;
    }

    public int getTime() {
        return time;
    }

   
    public void setTime(int timeInMinutes) {
        this.time = timeInMinutes;
    }
    
    public void display(){
        super.display();
        System.out.println("Time is minute:\t"+time);
    }
}
