package com.upax.masterlist.modules.recyclermaster.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.upax.masterlist.modules.recyclermaster.adapter.helpers.TimeLineVHFactory;
import com.upax.masterlist.modules.recyclermaster.adapter.types.BaseVHTimeLine;
import com.upax.masterlist.modules.recyclermaster.entities.base.ModelItemBase;

import java.util.ArrayList;
import java.util.List;

public class AdapterBaseTimeline extends RecyclerView.Adapter<BaseVHTimeLine> {

    private List<ModelItemBase> items = new ArrayList<>();

    public void updateData( List<ModelItemBase> items ) {
        this.items = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaseVHTimeLine onCreateViewHolder(@NonNull ViewGroup parent, int type) {
       return TimeLineVHFactory.getViewHolder(parent , type);
    }

    @Override
    public int getItemViewType(int position) {
       return ETypeView.get(items.get(position));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseVHTimeLine holder, int position) {
        holder.putData(items.get(position));
        holder.setIsRecyclable(false);
    }

    @Override
    public void onViewRecycled(@NonNull BaseVHTimeLine holder) {
        super.onViewRecycled(holder);
        holder.onViewRecycled();
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }
}
