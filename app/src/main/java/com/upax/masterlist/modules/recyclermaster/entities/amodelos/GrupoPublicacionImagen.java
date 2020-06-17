package com.upax.masterlist.modules.recyclermaster.entities.amodelos;

import com.upax.masterlist.modules.recyclermaster.entities.base.GroupModelBase;

import java.util.List;

public class GrupoPublicacionImagen extends GroupModelBase<PublicacionImagen> {
    public String name;

    public GrupoPublicacionImagen(List<PublicacionImagen> list, String name) {
        super(list);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
