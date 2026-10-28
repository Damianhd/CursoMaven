package com.damian;

import org.apache.commons.lang3.StringUtils;

public class HolaMaven {

    public static void main(String[] args) {

        String nombre = "";

        if (StringUtils.isBlank(nombre)) {
            System.out.println("El nombre está vacío.");
        } else {
            System.out.println("El nombre es: " + nombre);
        }

        System.out.println("Mi proyecto Java ya está en GitHub.");
    }
}