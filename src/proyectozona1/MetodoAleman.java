
package proyectozona1;

public class MetodoAleman extends Amortizacion implements Operacion{
    @Override
    public double calculoCuotas(int anios){
        double resultado;
        resultado=(montoPrestamo/numeroAnios);
        return resultado;
    }
    
    @Override
    protected double PagoInteres(){
        double resultado=0;
        double tasa;
        tasa=(tasaInteres/12)/100;
        resultado=(montoPrestamo)*tasa;
        return resultado;
    }
}
