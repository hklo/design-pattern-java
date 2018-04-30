package com.training.lib.state;

public class OffState implements IBulbState {
    @Override
    public void switchToNextState(Bulb b) {
        b.setState(BulbManager.getInstance().getState(Pct25State.class));
    }
}
