package org.parking.java.entities;

public class Carro {
    //Atributos de clase
    //1.modiificador de acceso
    //2. tipo de dato 
    //3. nombre de atributo
    public String placa;
    //constructor
    //sin parametros: 
    public TipoVehiculo tipoVehiculo;
    public Carro() {
    }
    //constructor parametrizado
    public Carro(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }


}
