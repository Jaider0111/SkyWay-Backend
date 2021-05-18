package com.unal.skyway.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Arrays;


public class Store {

    @Id
    public String id;
    public String identificacion;
    public String nombre;
    public String contrasena;
    public String categoria;
    public String[] horario;
    public String telefono;
    public String correo;
    public String direccion;
    public String[] producto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String[] getProducto() {
        return producto;
    }

    public void setProducto(String[] producto) {
        this.producto = producto;
    }

    public Store() {}

    public Store(String identificacion, String nombre, String contrasena, String categoria, String[] horario, String telefono, String correo, String direccion, String[] producto) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.categoria = categoria;
        this.horario = horario;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id='" + id + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", categoria='" + categoria + '\'' +
                ", horario=" + Arrays.toString(horario) +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", producto=" + Arrays.toString(producto) +
                '}';
    }

}