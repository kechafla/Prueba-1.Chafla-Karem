package com.example.Prueba_2.Model;

public class ModeloCliente {
    private double saldoAnterior;
    private double compras;
    private double pago;

    private double saldoActual;
    private double pagoMinimo;
    private double pagoNoIntereses;
    private double interesGenerado;

    // Getters y setters
    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCompras() {
        return compras;
    }

    public void setCompras(double compras) {
        this.compras = compras;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(double pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public double getPagoNoIntereses() {
        return pagoNoIntereses;
    }

    public void setPagoNoIntereses(double pagoNoIntereses) {
        this.pagoNoIntereses = pagoNoIntereses;
    }

    public double getInteresGenerado() {
        return interesGenerado;
    }

    public void setInteresGenerado(double interesGenerado) {
        this.interesGenerado = interesGenerado;
    }
}
