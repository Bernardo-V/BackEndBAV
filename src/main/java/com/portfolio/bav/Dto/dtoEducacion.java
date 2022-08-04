package com.portfolio.bav.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private String fechaEdu;
    
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, String fechaEdu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.fechaEdu = fechaEdu;
    }
    
    // Getters & Setters

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }
    
    
    
}