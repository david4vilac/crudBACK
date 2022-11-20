package com.tutorial.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductoDto {

    @NotBlank
    private String nombre;
    @Min(0)
    private Float precio;
    private String image;

    public ProductoDto() {
    }

    public ProductoDto(@NotBlank String nombre, @Min(0) Float precio, String image) {
        this.nombre = nombre;
        this.precio = precio;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
