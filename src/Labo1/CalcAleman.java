
package Labo1;

public class CalcAleman extends Amortizacion implements Operacion{
    @Override
    public double calculoCuotas(int anios){
        double resultado;
        resultado=(this.montoPrestamo/this.numeroAnios);
        return resultado;
    }
    
    @Override
    protected double PagoInteres(){
        double resultado = 0;
        double tasa;
        tasa=(tasaInteres/12)/100;
        resultado=(montoPrestamo)*tasa;
        return resultado;
    }
}
