package com.company;

import java.io.*;

public class Airliner {
    String name;
    int Passengers;
    String Variants;
    double Cargo_capacity;

    /* Конструктор класса Airliner. */
    public Airliner(String name){
        this.name = name;
    }
    /* Вместимость (кол-во пассажиров) Passengers. */
    public void AirPassengers(int AirPassengers){
        Passengers =  AirPassengers;
    }
    /* Модификация самалета Variants. */
    public void AirVariants(String AirVariants){
        Variants = AirVariants;
    }
    /* Грузовая вместимость Cargo_capacity. */
    public void AirCargo_capacity(double AirCargo_capacity){
        Cargo_capacity = AirCargo_capacity;
    }
    /* Вывод информации. */
    public void printAirliner(){
        System.out.println("Наименование:"+ name );
        System.out.println("Вместимость (Кол-во пассажиров):" + Passengers );
        System.out.println("Модификация:" + Variants );
        System.out.println("Грузовая вместимость (м³):" + Cargo_capacity);
        System.out.println("");
    }

}
