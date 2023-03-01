package orientacaoaobjetos2;


public class BMW extends Carro2 implements Utilitario, Coversivel{
    
    public BMW () {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal / tempoFinal;
    }
    
    @Override
    public void piscarAlerta() {
        System.out.println("BMW piscando alerta...");
    }
     
    @Override
    public void acionarTurbo() {
        // TODO Auto-generated method stub
    }
 
    @Override
    public void passear() {
        // TODO Auto-generated method stub
    }
    
    @Override
    public void abrirCapo() {
        // TODO Auto-generated method stub
    }
        
    }
            
    

