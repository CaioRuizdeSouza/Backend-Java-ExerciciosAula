package estruturadecontrole;

public class For {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        
        // for apenas com a condição
        
        int i = 0;
        for (; i < 10;){
            System.out.println(i);
            i++;
        }
        
        // for loop infinito
        
        for(;;){
            System.out.println("loop infinito");
        }
    }
}
