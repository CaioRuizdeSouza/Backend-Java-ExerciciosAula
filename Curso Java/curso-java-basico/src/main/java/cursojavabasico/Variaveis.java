package cursojavabasico;


public class Variaveis {
    public static void main(String[] args) {
        byte numByte = -128; // -128 a 127 (8 bits)
        short numShort = 12321; // -32768 a 32767 (16 bits)
        int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647 (32 bits)
        long numLong = 2147483647; // -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64 bits) 
        
        float numFloat = 10.000f;
        double numDouble = 100000000000000.000;
        
        char varChar = 'F'; // 0 a 65535 (16 bits)
        
        boolean varBoolean = true; // true ou false (1 bit)
        
        String texto = "Bem vindo Devs!";
        Integer numeroConta = 4000;
        Long numeroLongo = 1213123L;
        
        // Ele deve começar com letra minúscula. Exemplo: nome
        // Não deve começar com caracteres especiais como &, $, _(sublinhado). Exemplo:_nome
        // Se o nome for composto por mais de uma palavra, inicia-se a primeira palavra com a letra minúscula seguida por uma letra maiúscula. Exemplo: idadePessoa
        
        String nomeCompleto = "Davide";
        int idade = 21;
        
        System.out.println("Olá " + nomeCompleto + " você tem " + idade + " anos.");
            
    }
}
