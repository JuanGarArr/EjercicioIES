package com.iesam.IES.domain.models;

public interface Aulas {
    public Integer id = null;
    public String planta = null;
    public Integer sillas = null;
    public Integer capacidad = null;
    public Cursos cursos = null;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {

    }

    public static String getPlanta() {
        return planta;
    }

    public static void setPlanta(String planta) {
    }

    public static Integer getSillas() {
        return sillas;
    }

    public static void setSillas(Integer sillas) {

    }

    public static Integer getCapacidad() {
        return capacidad;
    }

    public static void setCapacidad(Integer capacidad) {

    }

    public static Cursos getCursos() {
        return cursos;
    }

    public static void setCursos(Cursos cursos) {

    }
}
