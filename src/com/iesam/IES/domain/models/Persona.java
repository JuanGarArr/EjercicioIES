package com.iesam.IES.domain.models;

public interface Persona {
     public Integer id = null ;
     public String nombre = null;
     public String apellidos = null;
     public String dni = null;
     public String direccion = null;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {

    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre){

    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {

    }

    public static String getDni() {
        return dni;
    }

    public static void setDni(String dni) {

    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {

    }
}
