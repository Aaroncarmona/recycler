package com.upax.masterlist.modules.recyclermaster.entities.amodelos;

import com.upax.masterlist.modules.recyclermaster.entities.base.ElementoBase;

public class PublicidadElemento extends ElementoBase {

    private int descuento;
    private String comapany;
    private String img;

    public PublicidadElemento(int descuento, String comapany, String img) {
        this.descuento = descuento;
        this.comapany = comapany;
        this.img = img;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getComapany() {
        return comapany;
    }

    public void setComapany(String comapany) {
        this.comapany = comapany;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
