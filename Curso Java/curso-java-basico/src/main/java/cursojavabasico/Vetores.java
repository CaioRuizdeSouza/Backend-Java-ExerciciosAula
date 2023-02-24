package cursojavabasico;

public class Vetores {
    public static void main(String[] args) {
        int[] notas = new int[10];
        
        notas[0] = 1;
        notas[2] = 5;
        notas[6] = 9;
        notas[4] = 2;
        notas[1] = 4;
        notas[9] = 7;
        notas[7] = 8;
        
        String[] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};
        
        for (String carro : carros){
            System.out.println(carro);
        }
        
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        
        System.out.println(notas[0]);
        System.out.println(notas[2]);
        System.out.println(notas[6]);
        System.out.println(notas[4]);
        System.out.println(notas[1]);
        System.out.println(notas[9]);
        System.out.println(notas[7]);
    }
}
