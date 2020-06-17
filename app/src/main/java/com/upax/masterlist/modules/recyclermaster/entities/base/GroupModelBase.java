package com.upax.masterlist.modules.recyclermaster.entities.base;

import java.util.List;

public abstract class GroupModelBase<T extends ModelItemBase> extends ModelItemBase {
    private List<T> list;

    public GroupModelBase(List<T> list) {
        this.list = list;
    }

    public List<ModelItemBase> getList() {
        return (List<ModelItemBase>) list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
