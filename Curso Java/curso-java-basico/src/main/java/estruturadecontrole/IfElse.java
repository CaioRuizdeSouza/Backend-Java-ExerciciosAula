package estruturadecontrole;

public class IfElse {
    public static void main(String[] args) {
        int idade = 17;
        
        if(idade >= 18) {
            System.out.println("Maior de idade");
        }
        
        if(idade >= 18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
        
        if(idade >= 100) {
            System.out.println("Virou uma mumia");
        }else if (idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
        
        if(idade >= 18) System.out.println("Maior de idade");
        System.out.println("Sua idade: " + idade);
        
        int nota = 7;
        if(nota >= 7) {
            System.out.println("Aprovado");
        }
        
        // if else 
        
        if(nota >= 7) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
