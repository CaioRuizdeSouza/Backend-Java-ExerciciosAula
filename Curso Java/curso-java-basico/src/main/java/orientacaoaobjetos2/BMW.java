package orientacaoaobjetos2;

public class BMW extends Carro2 {
    
    public BMW () {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal / tempoFinal;
    }
    
    
}
