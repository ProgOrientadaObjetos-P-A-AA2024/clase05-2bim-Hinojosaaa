package paquete04o;

public class TransporteAereo extends Transporte{

    private String cooperativaAerea;
    
   public void establecerCooperativaAerea(String n){
        cooperativaAerea = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 200 + (200*0.5);
    }
    
    
    public String obtenerCooperativaAerea(){
        return cooperativaAerea;
    }
}
