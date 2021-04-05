
package lab6;
    public class ObjectCounter {
    private static int c_Obj;
    private static int d_Obj;
    
    ObjectCounter(){
        c_Obj++;
    }
    
    public static int getcObj(){
        return c_Obj;
    }
    
    public static void delete(ObjectCounter o){
        o = null;
        c_Obj--;
        d_Obj++;
    }
    
    public static int getdObj(){
        return d_Obj;
    }
    
}
    