package com.training.lib.state;

import java.util.LinkedList;
import java.util.List;

public class BulbManager {
    private static BulbManager instance;
    private List<IBulbState> states = new LinkedList<>();

    private BulbManager() {
    }

    public static BulbManager getInstance() {
        if (instance == null) {
            instance = new BulbManager();
        }

        return instance;
    }

    public IBulbState getState (Class<?> type) {
        IBulbState state = states.stream().filter(x -> x.getClass().equals(type)).findFirst().orElse(null);

        if (state == null) {
            try {
                state = (IBulbState) Class.forName(type.getName()).newInstance();
                states.add(state);
            } catch (Exception ex) {

            }
        }

        return state;
    }
}
