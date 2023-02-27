package orientacaoaobjetos2;

public class Principal {
    public static void main(String[] args) {
        Carro2 bmw = new Carro2();
        bmw.marca = "BMW";
        bmw.modelo = "M3";
        bmw.quilometrosPorLitro = 7.5;
        bmw.taxaAceleracao = 50;
        bmw.velocidadeMaxima = 280;
        
        System.out.println(bmw.marca);
        System.out.println(bmw.modelo);
        System.out.println(bmw.quilometrosPorLitro);
        System.out.println(bmw.taxaAceleracao);
        System.out.println(bmw.velocidadeMaxima);
        
        bmw.acelerar();
        bmw.frear();
        bmw.virar();
    }
}
