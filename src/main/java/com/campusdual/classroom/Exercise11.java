package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        System.out.println("La tv esta encendida: "+redRemote.turnOn());
        System.out.println("El canal antes de subir es: "+redRemote.channel);
        redRemote.channelUp();
        System.out.println("Canal subido");
        System.out.println("El canal despues de subir es: "+redRemote.channel);
        redRemote.channelDown();
        System.out.println("Canal bajado");
        System.out.println("El canal despues de bajar es: "+redRemote.channel);
        redRemote.channel=0;
        System.out.println(redRemote.channel);
        System.out.println("Cambiado el canal a 0");
        redRemote.channelDown();
        System.out.println("Intentado bajar el canal");
        System.out.println(redRemote.channel);

        System.out.println("El volumen es: "+redRemote.volume);
        redRemote.volumeUp();
        System.out.println("Volumen subido");
        System.out.println("El volumen es: "+redRemote.volume);
        redRemote.volumeDown();
        System.out.println("Volumen bajado");
        System.out.println("El volumen es: "+redRemote.volume);
        redRemote.volume=0;
        System.out.println("Cambiado el volumen a 0");
        System.out.println("El volumen es: "+redRemote.volume);
        redRemote.volumeDown();
        System.out.println("Intentamos bajar el volumen");
        System.out.println("El volumen es: "+redRemote.volume);

        System.out.println(redRemote.getColor());
        System.out.println("La tv esta encendida: "+redRemote.turnOff());

    }



}