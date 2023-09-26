package com.juanma.ejemplo2.model;

public class Curso {

        private String codigo;
        private String nombre;
        private int duracion;
        private int precio;
    
        // Constructor
        public Curso(String codigo, String nombre, int duracion, int precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.duracion = duracion;
            this.precio = precio;
        }
    
        // Getters y setters
        public String getCodigo() {
            return codigo;
        }
    
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getDuracion() {
            return duracion;
        }
    
        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }
    
        public int getPrecio() {
            return precio;
        }
    
        public void setPrecio(int precio) {
            this.precio = precio;
        }
    }

