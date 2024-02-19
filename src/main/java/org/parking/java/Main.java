package org.parking.java;

import org.parking.java.entities.Carro;
import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;

public class Main {
    public static void main(String[] args) {
        //sistema de gestion de E/S
        //de vehiculos en un parking
        //1. carritos:
        //objetos (instancias)
        //1. Tipo de clase
        //2. nombre del objeto
        //3. asignacion y new 
        //4. constructor del objeto
        Carro terreneitor1 = new Carro("EBG 789", TipoVehiculo.PARTICULAR);

        Carro terreneitor2 = new Carro("DSA 987", TipoVehiculo.CAMIONETA);

        System.out.println(terreneitor1.tipoVehiculo);
        System.out.println("------");
        System.out.println(terreneitor1.placa);

        //crear un objeto
        Cliente cliente1 = new Cliente("Eric", "Mas Turba", 129380374L);
        //invocar
        cliente1.addCar(terreneitor2); 
        //recorrer la lista de vehiculo
        cliente1.addCar(terreneitor1);
        cliente1.addCar("WWW333", TipoVehiculo.MOTO);

        for(Carro cr :cliente1.misCarros){
            System.out.println(cr.placa);
            System.out.println(cr.tipoVehiculo);
            System.out.println("-----------");
           
        }
    }
}