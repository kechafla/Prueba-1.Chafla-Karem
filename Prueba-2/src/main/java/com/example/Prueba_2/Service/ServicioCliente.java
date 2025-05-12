package com.example.Prueba_2.Service;


import org.springframework.stereotype.Service;
import com.example.Prueba_2.Model.ModeloCliente;

@Service
public class ServicioCliente {
    public void calcularDatos(ModeloCliente cliente) {
        double saldoActual = cliente.getSaldoAnterior() + cliente.getCompras() - cliente.getPago();
        cliente.setSaldoActual(saldoActual);

        double pagoMinimo = saldoActual * 0.15;
        double pagoNoIntereses = saldoActual * 0.85;
        cliente.setPagoMinimo(pagoMinimo);
        cliente.setPagoNoIntereses(pagoNoIntereses);

        if (cliente.getPago() < pagoMinimo) {
            double interes = saldoActual * 0.12 + 200;
            cliente.setInteresGenerado(interes);
        } else {
            cliente.setInteresGenerado(0);
        }
    }
}
