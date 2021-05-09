package com.unal.skyway.models;
import org.springframework.data.annotation.Id;


public class Store {

    @Id
    public String nit;

    public String nombre;
    public String categoria;
    public String horario;
    public int costo_domicilio;
    public String direccion;
    public String[] producto;

    public String getNit() { return nit;}

    public void setNit(String nit) {this.nit = nit;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCategoria() {return categoria;}

    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getHorario() {return horario;}

    public void setHorario(String horario) {this.horario = horario;}

    public int getCosto_domicilio() {return costo_domicilio;}

    public void setCosto_domicilio(int costo_domicilio) {this.costo_domicilio = costo_domicilio;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String[] getProducto() {return producto;}
    public void setProducto(String[] producto) {this.producto = producto;}


    public Store() {}

    public Store(String nombre, String categoria, String horario, int costo_domicilio, String direccion, String[] producto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.horario = horario;
        this.costo_domicilio = costo_domicilio;
        this.direccion = direccion;
        this.producto = producto;

    }

    @Override
    public String toString() {
        return String.format(
                "Tienda[id=%s, nombre='%s', categoria='%s', horario='%s', costo_domicilio='%s', direccion='%s', producto='%s']",
                nit,nombre, categoria, horario, costo_domicilio, direccion, producto);

    }

}