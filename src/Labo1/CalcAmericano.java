/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo1;

/**
 *
 * @author Steve S
 */
public class CalcAmericano extends Amortizacion implements Operacion{

    @Override
    protected double PagoInteres() {
        return this.montoPrestamo * super.getInteresMensual();
    }

    @Override
    public double calculoCuotas(int anios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
