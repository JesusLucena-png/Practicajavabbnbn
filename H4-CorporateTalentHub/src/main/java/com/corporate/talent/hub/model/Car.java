package com.corporate.talent.hub.model;

public class Car extends PublicPerson{

    public Car(String fullName, String identification, char gender) {
        super(fullName, identification, gender);
    }

    public void turnOn(){
        emitirSonido("Motor encendido");
    }

    public void honktheHorn(){
        emitirSonido("Claxon");
    }

    public void accelerate(){
        emitirSonido("Aceleración");
    }

    public void emitirSonido(String sonido) {

        switch (sonido) {
            case "Motor encendido" -> System.out.println("Brrrmmm...");
            case "Claxon" -> System.out.println("¡Piii! ¡Piii!");
            case "Aceleración" -> System.out.println("¡Vroooom!");
        }

    }

}
