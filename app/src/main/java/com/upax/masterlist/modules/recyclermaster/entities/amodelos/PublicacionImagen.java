package com.upax.masterlist.modules.recyclermaster.entities.amodelos;

import com.upax.masterlist.modules.recyclermaster.entities.base.ElementoBase;

public class PublicacionImagen extends ElementoBase {
    private String img;
    private int with;

    public PublicacionImagen(String img, int with) {
        this.img = img;
        this.with = with;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }
}

