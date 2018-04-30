package com.training.lib.singleton;

import java.util.ArrayList;
import java.util.List;

public class Settings {
    private static final int MAX = 3;
    private static List<Settings> _instances = new ArrayList<>();
    private static int _count;

    private int count;

    private Settings(int count) {
        this.count = count;
    }

    public static Settings getInstance() {
        if (_instances.size() < MAX) {
            _instances.add(new Settings(_count));
        }
        return _instances.get(_count++ % MAX);
    }

    public void printCount() {
        System.out.println(count);
    }

}
