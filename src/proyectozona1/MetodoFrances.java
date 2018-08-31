/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectozona1;

/**
 *
 * @author mmenchu
 */
public class MetodoFrances extends Amortizacion implements Operacion {
    private double saldoCuenta = 0.00;   

    public double getSaldoCuenta(){
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    @Override
    protected double PagoInteres() {
        
        return   this.saldoCuenta * this.getInteresMensual();
    }

    @Override
    public double calculoCuotas(int anios) {
        super.setNumeroAnios(anios);
        double c = 0.00;
        double unomasIn = Math.pow((1 + super.getInteresMensual()),super.getNumeroCuotas());
        c = super.getMontoPrestamo() * ((unomasIn * super.getInteresMensual()) / (unomasIn-1));
        return c;
    }
    public double calculoPagoCapital(){
        return 0.00;
    }
    public double calculoPagoCuota(){
        return 0.00;
    }  
}
