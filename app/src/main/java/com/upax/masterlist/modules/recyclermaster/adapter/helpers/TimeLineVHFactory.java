package com.upax.masterlist.modules.recyclermaster.adapter.helpers;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.upax.masterlist.modules.recyclermaster.adapter.ETypeView;
import com.upax.masterlist.modules.recyclermaster.adapter.types.BaseVHTimeLine;
import com.upax.masterlist.modules.
        recyclermaster.adapter.types.DesconocidoVH;
import com.upax.masterlist.modules.recyclermaster.adapter.types.GrupoPublicacionImagenVH;
import com.upax.masterlist.modules.recyclermaster.adapter.types.PublicacionImagenVH;
import com.upax.masterlist.modules.recyclermaster.adapter.types.PublicacionVideoVH;

public class TimeLineVHFactory {

    private TimeLineVHFactory() { throw new IllegalStateException("Utility class"); }

    public static BaseVHTimeLine getViewHolder(ViewGroup parent , int type ){

        if ( ETypeView.PUBLICACION_IMAGEN.is(type) ) {
            return new PublicacionImagenVH(createView(parent , ETypeView.PUBLICACION_IMAGEN.layout));
        } else if ( ETypeView.PUBLICACION_VIDEO.is(type) ) {
            return new PublicacionVideoVH(createView(parent , ETypeView.PUBLICACION_VIDEO.layout));
        } else if ( ETypeView.GRUPO_PUBLICACION_IMAGEN.is(type) ) {
            return new GrupoPublicacionImagenVH(createView(parent , ETypeView.GRUPO_PUBLICACION_IMAGEN.layout));
        }

        return new DesconocidoVH(createView(parent , ETypeView.DESCONOCIDO.layout));

    }

    private static View createView(ViewGroup parent , int layout) {
        return LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
    }

}
