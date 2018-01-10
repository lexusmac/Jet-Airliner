package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /* Создание трех объектов с помощью конструктора. */
        Airliner AirOne = new Airliner("Boeing 747-100");
        Airliner AirTwo = new Airliner("Airbus A380");
        Airliner AirThree = new Airliner("Boeing 747-8");

        // Вызов метода для каждого созданного объекта.
        AirOne.AirPassengers(452);
        AirOne.AirVariants("747-100");
        AirOne.AirCargo_capacity(170.6);
        AirOne.printAirliner();

        AirTwo.AirPassengers(525);
        AirTwo.AirVariants("A380-800");
        AirTwo.AirCargo_capacity(184);
        AirTwo.printAirliner();

        AirThree.AirPassengers(581);
        AirThree.AirVariants("747-8");
        AirThree.AirCargo_capacity(275.6);
        AirThree.printAirliner();
    }
}
