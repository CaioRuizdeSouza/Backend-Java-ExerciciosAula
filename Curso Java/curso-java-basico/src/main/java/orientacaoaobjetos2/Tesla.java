package orientacaoaobjetos2;

public class Tesla extends Carro2 {
    
    private boolean dirigeSozinho;
    
    public Tesla(){
        super();
    }
    
    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal * tempoFinal;
    }

    public boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    public void setDirigeSozinho(boolean dirigeSozinho) {
        this.dirigeSozinho = dirigeSozinho;
    }
    
    
}
