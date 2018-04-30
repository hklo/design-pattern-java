package com.training.lib.composite;

import com.training.lib.util.StringUtil;

import java.util.LinkedList;
import java.util.List;

public class Folder implements IFso {
    private List<IFso> childs = new LinkedList<>();
    private String name;
    private IFso parent;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void copy(String dest) {

        String folderDest = getDir(dest);
        String indent = StringUtil.repeat("\t", getLvl());

        System.out.println(String.format("%s%s [%s] [%d] (created)", indent, name, folderDest, getSize()));

        childs.forEach(f ->
                f.copy(folderDest)
        );
    }

    @Override
    public int getLvl() {
        if (parent == null) {
            return 0;
        }
        return parent.getLvl() + 1;
    }

    @Override
    public void setParent(IFso parent) {
        this.parent = parent;
    }

    public String getDir(String dest) {
        return String.format("%s/%s", dest, name);
    }

    public int getSize() {
        int total = 0;
        for (IFso f : childs) {
            total += f.getSize();
        }

        return total;
    }

    public void add(IFso f) {
        f.setParent(this);
        childs.add(f);
    }
}
