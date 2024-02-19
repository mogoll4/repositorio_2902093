package org.parking.java.entities;


import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombres;
    public String apellido;
    public Long numeroIdentificacion;
    public List <Carro> misCarros = 
        new ArrayList<Carro>(); 
    //definir metodo de clase 
    // addCar: vicnular un carrtio al clinte 
    public void addCar(Carro carro){
        //añadir el carrito que viene el parametro
        //this:para acceder a atributos y metodos
        this.misCarros.add(carro);
    }

    public void addCar(String placa, 
                        TipoVehiculo tv){
            Carro cr = new Carro();
            cr.placa = placa;
            cr.tipoVehiculo =tv;
            this.misCarros.add(cr);

        }

    public Cliente() {
    }

    public Cliente(String nombres, String apellido, Long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
    }
        
}
