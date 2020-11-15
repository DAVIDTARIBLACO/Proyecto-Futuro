package com.daw;

public class Main {

    public static void main(String[] args) {
        String alumno = args[0];
        Integer modulos = Integer.valueOf(args[1]);
        Integer horasSemanales = Integer.valueOf(args[2]);
        String resultado = veredicto(horasSemanales, modulos);
        System.out.println("Estudiante " + alumno + " : ");
        System.out.println(resultado);
        System.out.println("Esto es un comentario de David Tarí Blasco para un commit");
    }

    private String veredicto(Integer horasSemanales, Integer modulos) {
        if (horasSemanales.equals(modulos)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (horasSemanales < modulos){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
