package com.training.lib.composite;

public interface IFso {
    void copy(String dest);

    int getSize();

    int getLvl();

    void setParent(IFso parent);
}
