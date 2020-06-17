package com.upax.masterlist.modules.recyclermaster.adapter.types;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.upax.masterlist.R;
import com.upax.masterlist.modules.recyclermaster.adapter.AdapterBaseTimeline;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.GrupoPublicacionImagen;

public class GrupoPublicacionImagenVH extends BaseVHTimeLine<GrupoPublicacionImagen> {

    private RecyclerView rv;
    private AdapterBaseTimeline adapter;
    private GrupoPublicacionImagen mItemGroupImage;
    private TextView nameGroup;

    public GrupoPublicacionImagenVH(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void start() throws Exception {
        rv = view.findViewById(R.id.rv_images);
        nameGroup = view.findViewById(R.id.tv_name);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext() , RecyclerView.HORIZONTAL , false));

        nameGroup.setText(mItemGroupImage.getName());

        adapter = new AdapterBaseTimeline();
        rv.addItemDecoration(new DividerItemDecoration(getContext() , DividerItemDecoration.HORIZONTAL));
        rv.setAdapter(adapter);

        udpateData();
    }


    public void udpateData() {
        adapter.updateData(mItemGroupImage.getList());
    }

    @Override
    public void castItem() throws Exception {
        mItemGroupImage = (GrupoPublicacionImagen) mItem;
    }
}
