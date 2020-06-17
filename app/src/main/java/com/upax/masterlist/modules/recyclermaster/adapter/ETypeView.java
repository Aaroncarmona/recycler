package com.upax.masterlist.modules.recyclermaster.adapter;

import com.upax.masterlist.R;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.GrupoPublicacionImagen;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionImagen;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionVideo;
import com.upax.masterlist.modules.recyclermaster.entities.base.ModelItemBase;

public enum ETypeView {
    PUBLICACION_IMAGEN(1 , R.layout.item_publicacion_imagen),
    PUBLICACION_VIDEO(2 , R.layout.item_publicacion_video),
    PUBLICIDAD_ELEMENTO(3 , R.layout.item_publicidad_elmento),
    GRUPO_PUBLICACION_IMAGEN(4 , R.layout.item_group_publicacion),

    DESCONOCIDO(-1 , R.layout.item_publicacion_imagen)
    ;

    public int type;
    public int layout;

    ETypeView(int type , int layout ) {
        this.type = type;
        this.layout = layout;
    }

    public static ETypeView is ( ModelItemBase base ){
        if ( base instanceof PublicacionImagen ) {
            return PUBLICACION_IMAGEN;
        } else if ( base instanceof PublicacionVideo) {
            return PUBLICACION_VIDEO;
        } else if  (base instanceof GrupoPublicacionImagen ){
            return GRUPO_PUBLICACION_IMAGEN;
        }
        return DESCONOCIDO;
    }

    public static int get ( ModelItemBase base ) {
        return is(base).type;
    }

    public boolean is ( int value ) {
        return this == get(value);
    }

    public static ETypeView get ( int value ) {
        for ( ETypeView current :  ETypeView.values()) {
            if ( current.type == value ) return current;
        }
        return DESCONOCIDO;
    }

}
