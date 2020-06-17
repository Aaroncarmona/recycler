package com.upax.masterlist.modules.recyclermaster.adapter.types;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.upax.masterlist.modules.recyclermaster.entities.base.ModelItemBase;

public abstract class BaseVHTimeLine<T extends ModelItemBase> extends RecyclerView.ViewHolder {

    public ModelItemBase mItem;
    public View view;

    public void putData( T value  ) {
        mItem = value;
        try {
            castItem();
            start();
        }catch ( Exception e ) {
            Log.d("", "BaseVHTimeLine: ");
        }
    }

    public BaseVHTimeLine(@NonNull View itemView) {
        super(itemView);
        view = itemView;
    }

    public Context getContext(){
        return view.getContext();
    }

    public void onViewRecycled() {

    }

    public abstract void start() throws Exception ;
    public abstract void castItem() throws Exception;

}
