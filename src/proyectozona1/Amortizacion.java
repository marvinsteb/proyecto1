/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectozona1;

/**
 *
 */
public abstract class Amortizacion {
    protected double montoPrestamo;
    protected double tasaInteres;
    protected int numeroAnios;
    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getNumeroAnios() {
        return numeroAnios;
    }

    public void setNumeroAnios(int numeroAnios) {
        this.numeroAnios = numeroAnios;
    }
    protected abstract double PagoInteres();
}
