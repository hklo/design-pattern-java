package com.training.lib.state;

public class Bulb {
    private IBulbState state;

    public Bulb() {
        state = new OffState();
    }

    public IBulbState getState() {
        return state;
    }

    public void setState(IBulbState state) {
        this.state = state;
    }

    public void touch() {
        state.switchToNextState(this);
    }
}
