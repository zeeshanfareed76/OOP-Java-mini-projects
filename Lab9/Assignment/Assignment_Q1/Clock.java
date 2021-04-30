
package lab09;

/**
 *
 * @author BOSS
 */
public class Clock {
int hour;
int minute;
int second;

public Clock(){
this.hour=12;
this.minute=00;
this.second=00;
}

public Clock(int h, int m, int s){
this.hour=h;
this.minute=m;
this.second=s;
}
public void Display(){
    System.out.println("Time in 24h Format   "+hour+":"+minute+":"+second);
}
    
}
