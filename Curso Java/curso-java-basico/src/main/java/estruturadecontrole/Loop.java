package estruturadecontrole;

public class Loop {
    public static void main(String[] args) {
        int count = 10;
        
        while (count < 100) {
            System.out.println("count: " + count);
            count++;
        }
        
        int countDois = 101;
        do{
            System.out.println(countDois);
            countDois++;
        } while(countDois < 100);
        
        // for normal
        int i = 0;
        for(; i < 100 ;){
            System.out.println(i);
             i++; 
        }
        
        for(;;){
            System.out.println("for");
        }
        
        
    }
}
