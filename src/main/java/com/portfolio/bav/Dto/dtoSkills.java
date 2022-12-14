package com.portfolio.bav.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {

    @NotBlank
    private String nombreS;
    @NotBlank
    private String porcentajeS;
    @NotBlank
    private String imagenS;

    //CONSTRUCTORES
    public dtoSkills() {
    }

    public dtoSkills(String nombreS, String porcentajeS, String imagenS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
        this.imagenS = imagenS;
    }

    // GETTERS & SETTERS
    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }

    public String getImagenS() {
        return imagenS;
    }

    public void setImagenS(String imagenS) {
        this.imagenS = imagenS;
    }

}