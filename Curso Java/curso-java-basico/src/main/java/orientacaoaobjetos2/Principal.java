package orientacaoaobjetos2;

public class Principal {
    static int valor = 10;
    
    static void print(){
        System.out.println(valor);
    }
    
    public static void main(String[] args) {
        valor = 10;
        Carro2 bmw = new Carro2();
        bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setQuilometrosPorLitro(7.5);
        //bmw.taxaAceleracao = 50;
       // bmw.setVelocidadeMaxima(280);
        
        Carro2 mercedes = new Carro2("Mercedes", "c180");
        
        BMW bmwDois = new BMW ();
        Tesla tesla = new Tesla();
        tesla.isDirigeSozinho();
        bmwDois.piscarAlerta();
        
        
        BMW bmwtres = null;
        
        bmwtres.acelerar();
        
        try{
            bmwDois.setVelocidadeMaxima(-10);
        } catch(NegocioException e) {
            System.out.println(e);
        }finally {
            System.out.println("passou aqui");
        }
       
        Carro2 teslaDois = new Tesla();
        ((Tesla)teslaDois).setDirigeSozinho(true);
        System.out.println(((Tesla)teslaDois).isDirigeSozinho());
        teslaDois.piscarAlerta();
        Carro2[] carros = new Carro2[] {bmwDois, tesla, teslaDois};
        
        for(Carro2 carro : carros) {
            if(Constantes.MARCA_FAMOSA.equals(carro.getMarca())){
                System.out.println("Carro de marca famosa");
            }
            if(carro instanceof Tesla){
                System.out.println(((Tesla)carro).isDirigeSozinho());
            }
        }
        
        Calcular.soma(0, 0)
        
        teslaDois.calcularTaxaAceleracao(100.50, 10);
        bmwDois.calcularTaxaAceleracao(100.50, 10);
       
        
        System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
        
        System.out.println(mercedes.getMarca());
        System.out.println(mercedes.getModelo());
        System.out.println(bmw.getMarca());
        System.out.println(bmw.getModelo());
        System.out.println(bmw.getQuilometrosPorLitro());
        System.out.println(bmw.getTaxaAceleracao());
        System.out.println(bmw.getVelocidadeMaxima());
        
        bmw.acelerar();
        bmw.frear();
        bmw.virar();
        
        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
    }
}
