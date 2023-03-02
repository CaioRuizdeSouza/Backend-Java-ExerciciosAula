package lambdastream;

import java.util.random.RandomGenerator;

public class LambdaStream {
    
    static int gerarIdade(int min, int max){
           return new SplittableRandom().nextInt(min , max);
        }
}
    public static void main(String[] args) {
        List<String> nomes = Arrays.aslist("Alice", "João", "Maria", "Pedro", "Raquel", "Samuel");

        System.out.println("Lista de Nomes:");
        nomes.forEach((n) -> System.out.println(n));
        
        
        List<Pessoa> pessoas = nomes.stream().map((n)) -> new Pessoa(n, gerarIdade(15, 30))).collect(Collectors.toList());
        pessoas.forEach((p) -> System.out.println(p.getNome()+ "" + p.getIdade()));

        System.out.println("Lista de Pessoas maiores de idade");
        List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p) -> 
        p.getIdade() >= 18).collect(Collectors.toList());
        pessoasMaioresDeIdade.forEach((p) -> System.out.println(p.getNome() + "" + p.getIdade()));

        System.out.println("Lista de Pessoas Ordenadas:");
        List<Pessoa> pessoaordenadas = pessoasMaioresDeIdade.stream().sorted((p1, p2) -> p2.getIdade() - p1.getIdade())
        .collect(Collectors.toList());
        pessoasOrdenadas.forEach(p -> System.out.println(p.getNome() + "" + p.getIdade()));

        System.out.println("Soma das idades:");
        Integer totalIdade = pessoasOrdenadas.stream().map(p -> getIdade ()).reduce
                (0, (somaIdade, idade) -> somaIdade += idade);
        System.out.println("Total: " + totalIdade);
}

    }
