package com.training.lib.composite;

import com.training.lib.util.StringUtil;

public class File implements IFso {
    private String name;
    private int size;
    private IFso parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void copy(String dest) {
        String indent = StringUtil.repeat("\t", getLvl());
        System.out.println(String.format("%s%s [%s] [%d] (copied)", indent, name, getDir(dest), getSize()));
    }

    public String getDir(String dest) {
        return String.format("%s/%s", dest, name);
    }

    public int getSize() {
        return size;
    }

    @Override
    public int getLvl() {
        return parent.getLvl() + 1;
    }

    @Override
    public void setParent(IFso parent) {
        this.parent = parent;
    }
}
