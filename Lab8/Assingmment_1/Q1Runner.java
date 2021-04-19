
package lab8;
import java.util.Scanner;
public class Q1Runner {
    public static void main(String[] args) {
        
        int choice=1;
        Scanner in=new Scanner(System.in);
     while(choice!=0){   
        System.out.println("Press 1 for Book or Press 2 for audio-cassette Or Press 0 to end: ");
        choice=in.nextInt();
     
     if(choice==1){
         
        System.out.println("Enter Title of Book: ");
        String title=in.next();
        System.out.println("Enter Price of Book: ");
        double price=in.nextDouble(); 
        System.out.println("Enter number of pages: ");
        int page=in.nextInt();
        Book b=new Book(page,title,price);
        b.display();}
     
     else if(choice==2){
        
        System.out.println("Enter the title of Tape: ");
        String title1=in.next();
        System.out.println("Enter the price of Tape: ");
        double price1=in.nextDouble();
        System.out.println("Enter the duration in minutes: ");
        int time=in.nextInt();
        Tape t=new Tape(title1, price1, time);
        t.display();}}
    
    }
}
