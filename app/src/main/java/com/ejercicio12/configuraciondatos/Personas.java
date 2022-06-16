package com.ejercicio12.configuraciondatos;

public class Personas {
    private String nombre,apellido,edad,correo;

    public Personas()
    {}

  public Personas(String nombre, String apellido,String edad, String correo)
  {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.correo=correo;
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
