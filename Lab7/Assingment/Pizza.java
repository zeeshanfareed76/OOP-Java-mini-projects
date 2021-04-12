package lab7;

public class Pizza {
    private String size;
    private int cToping;
    private int pToping;
    private int hToping;
   private double cost;
    
    public Pizza(String s, int c, int p, int h){
        size = s;
        cToping = c;
        pToping = p;
        hToping = h;
    }
    
    public void setSize(String s){
        size = s;
    }
    public void setChesseToping(int c){
        cToping = c;
    }
    public void setPepperoniToping(int p){
        pToping = p;
    }
    public void setHamToping(int h){
        hToping = h;
    }
    
    public String getSize(){
        return size;
    }
    public int getCheeseToping(){
        return cToping;
    }
    public int getPepperoniToping(){
        return pToping;
    }
    public int getHamToping(){
        return hToping;
    }
    
    public double calcCost(){
        if (size == "small"){
            cost = 10+(2*(cToping+pToping+hToping));
            return cost;
        }
        else if(size == "medium"){
            cost = 12+(2*(cToping+pToping+hToping));
            return cost;
        }
        else if(size == "large"){
            cost = 14+(2*(cToping+pToping+hToping));
            return cost;
        }
        else{
            System.out.println("Invalid Input");
        }
        return cost;
    }
    
    public String getDescription(){
        return "Size \t Cheese Topping \t Pepperoni Topping\t Ham Topping\n"+size+" \t : \t "+cToping+" \t \t : \t "+pToping+" \t \t : \t"+hToping;
        
    }
    
    
}
