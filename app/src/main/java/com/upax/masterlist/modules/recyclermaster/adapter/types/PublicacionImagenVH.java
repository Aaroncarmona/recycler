package com.upax.masterlist.modules.recyclermaster.adapter.types;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.upax.masterlist.R;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionImagen;

public class PublicacionImagenVH extends BaseVHTimeLine<PublicacionImagen> {

    private ImageView image;
    private PublicacionImagen mItemImagen;

    public PublicacionImagenVH(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void start() {
        image = view.findViewById(R.id.image);
        Glide.with(view)
            .load(mItemImagen.getImg())
            .centerCrop()
            .into(image);
    }

    @Override
    public void castItem() {
        mItemImagen = (PublicacionImagen) mItem;

    }

}
