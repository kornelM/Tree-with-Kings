package com.mycompany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kornel on 24.05.17.
 */
public class TreeItem {
    private Set<TreeItem> children = new HashSet<TreeItem>();
    private Object data;

    public TreeItem(Object data) {
        this.data = data;
    }

    public void addChild(TreeItem children) {
        this.children.add(children);
    }

    public Set<TreeItem> getChildren(){
        return this.children;
    }

    public Object getData() {
        return data;
    }
    public boolean hasChild(){
        if (this.children == null)
            return false;
        else
            return true;
    }
}
