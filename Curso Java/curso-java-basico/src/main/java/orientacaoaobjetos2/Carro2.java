package orientacaoaobjetos2;

public abstract class Carro2 {
    
    /* Modificadores de acesso
    default => não tem uma palavra chave (palvara reservada). 
    Acessível própria classe ou classe de um mesmo pacote.
    public => Acessível própria classe, classe mesmo pacote, subclasses (extends), 
    todas as demais classes.
    private => Acessível própria classe 
    procted => Acessível própria casse, classe mesmo pacote, suclasses(extends).
    */
    
    
    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int taxaAceleracao;
    private double quilometrosPorLitro;
    
    public Carro2(){
        System.out.println("Construindo um carro");
    }
    
    public Carro2(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar() {
        System.out.println("Acelerando......");
    }
    
    public void frear() {
        System.out.println("Freando.....");
    }
    
    public abstract void piscarAlerta();
    
    public void virar() {
        System.out.println("Virando.......");
    }
    
    public double calcularTaxaAceleracao
        (double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial){
        return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
    }
        
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal){
        return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException{
        if(velocidadeMaxima < 0){
            throw new NegocioException ("Valor é inválido");
        }else{
        this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public int getTaxaAceleracao() {
        return taxaAceleracao;
    }

    public void setTaxaAceleracao(int taxaAceleracao) {
        this.taxaAceleracao = taxaAceleracao;
    }

    public double getQuilometrosPorLitro() {
        return quilometrosPorLitro;
    }

    public void setQuilometrosPorLitro(double quilometrosPorLitro) {
        this.quilometrosPorLitro = quilometrosPorLitro;
    }
    
    
    
}
