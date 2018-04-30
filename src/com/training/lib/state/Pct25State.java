package com.training.lib.state;

public class Pct25State implements IBulbState {
    @Override
    public void switchToNextState(Bulb b) {
        b.setState(BulbManager.getInstance().getState(Pct50State.class));
    }
}
