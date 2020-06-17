package com.upax.masterlist.modules.recyclermaster.helper;

import com.upax.masterlist.R;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.GrupoPublicacionImagen;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionVideo;
import com.upax.masterlist.modules.recyclermaster.entities.base.ModelItemBase;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionImagen;

import java.util.ArrayList;
import java.util.List;

public class TimeLineFactory {

    public static List<ModelItemBase> createDataDummy() {

        List<ModelItemBase> list = new ArrayList<>();

        list.add(new PublicacionImagen("https://www.ecestaticos.com/imagestatic/clipping/dfd/996/dfd996d0c22dd7e69412274972f5598d/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg?mtime=1579565836" , 0));

        list.add( new GrupoPublicacionImagen(new ArrayList<PublicacionImagen>(){{
            add(new PublicacionImagen("https://i.blogs.es/dc273d/nuevo-logo-w3c-html5/1366_2000.png" , 0));
            add(new PublicacionImagen("https://i.blogs.es/dc273d/nuevo-logo-w3c-html5/1366_2000.png" , 0));
            add(new PublicacionImagen("https://www.ecestaticos.com/imagestatic/clipping/dfd/996/dfd996d0c22dd7e69412274972f5598d/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg?mtime=1579565836" , 0));
        }} , "PRUEBA DE IMAGENES 1"));

        list.add( new GrupoPublicacionImagen(new ArrayList<PublicacionImagen>(){{
            add(new PublicacionImagen("https://www.ecestaticos.com/imagestatic/clipping/dfd/996/dfd996d0c22dd7e69412274972f5598d/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg?mtime=1579565836" , 0));
            add(new PublicacionImagen("https://i.blogs.es/dc273d/nuevo-logo-w3c-html5/1366_2000.png" , 0));
            add(new PublicacionImagen("https://i.blogs.es/dc273d/nuevo-logo-w3c-html5/1366_2000.png" , 0));
        }} , "PRUEBA DE IMAGENES 2"));
        list.add(new PublicacionVideo("google.com" , 10 , R.raw.prueba));
        return list;
    }

}