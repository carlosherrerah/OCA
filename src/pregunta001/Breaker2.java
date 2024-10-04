package pregunta001;
public class Breaker2 {
    static String o = "";
    
    public static void main(String[] args) throws Exception {
        z:
        for(int x=2;x<7;x++){
            if(x==3) continue;
            if(x==5) break z;
            o=o+x;
        }
        
       Thread.sleep(3000);
        System.out.println(o);
    }    
}
