package paquete04o;

public class TransporteMaritimo extends Transporte {
    
    private String cooperativaMaritima;
    public double tarifa;
    
    public void establecerCooperativaMaritima(String n){
        cooperativaMaritima = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 14.00 + 0.10;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaMaritima;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }

}
