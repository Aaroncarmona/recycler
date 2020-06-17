package com.upax.masterlist.modules.recyclermaster.entities;

public class Usuario {
    private String name;
    private String lastName;
    private String img;

    public Usuario(String name, String lastName, String img) {
        this.name = name;
        this.lastName = lastName;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
