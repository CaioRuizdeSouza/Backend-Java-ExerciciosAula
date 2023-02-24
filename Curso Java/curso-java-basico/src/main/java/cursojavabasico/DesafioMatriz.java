package cursojavabasico;

public class DesafioMatriz {
    public static void main(String[] args) {
        String jogadores [][] = {{"Neymar", "Ronaldo"}, {"Messi", "Cristiano Ronaldo"}, {"Mbappe", "Marquinhos"}};
        System.out.println(jogadores [0][0] + "|" + jogadores[0][1]);
        System.out.println(jogadores[1][0]+ "|" + jogadores[1][1]);
        System.out.println(jogadores[2][0] + "|" + jogadores[2][1]);
        
        for(String[] j : jogadores) {
            for(String m:j){
                System.out.println(m);
            }
        }
    }
}
