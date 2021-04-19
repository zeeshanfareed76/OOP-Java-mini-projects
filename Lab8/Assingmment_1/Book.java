
package lab8;
public class Book extends Publication {
    public int page;
    
    public Book(int pageCount, String title, double price){
       super( title, price);
        this.page=pageCount;
     
    }

 
    public int getPage() {
        return page;
    }

    public void setPage(int pageCount) {
        this.page = pageCount;
    }
    public void display(){
        super.display();
        System.out.println("Page count:\t"+this.page);
        
     
    }
}