package com.upax.masterlist.modules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.upax.masterlist.R;
import com.upax.masterlist.modules.recyclermaster.adapter.AdapterBaseTimeline;
import com.upax.masterlist.modules.recyclermaster.entities.base.ModelItemBase;
import com.upax.masterlist.modules.recyclermaster.helper.TimeLineFactory;

import java.util.ArrayList;
import java.util.List;

public class MasterRecyclerFragment extends Fragment {

    private RecyclerView rv;
    private List<ModelItemBase> mItems = new ArrayList<>();
    private AdapterBaseTimeline adapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_master_recycler, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv = view.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext() , RecyclerView.VERTICAL , false));

        adapter = new AdapterBaseTimeline();

        rv.addItemDecoration(new DividerItemDecoration(getContext() , DividerItemDecoration.VERTICAL));

        rv.setAdapter(adapter);

        udpateData();
    }


    public void udpateData() {
        mItems = TimeLineFactory.createDataDummy();
        adapter.updateData(mItems);
    }
}
