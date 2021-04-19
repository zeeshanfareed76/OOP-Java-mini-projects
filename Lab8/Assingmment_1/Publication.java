package lab8;

public class Publication {
 String title;
 private double price;
 
 public Publication(String title,double price){
   this.title=title;
   this.price=price;
 
 }
 
    public void setTitle(String title){
        title=title;
 }
 
    public String getTitle(){
        return title;
 }

    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void display(){
        System.out.println("\nTitle:\t"+title+"\nPrice:\t"+price);
 
    }
 
    
}