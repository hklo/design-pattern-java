package com.training.lib.state;

public class Pct50State implements IBulbState {
    @Override
    public void switchToNextState(Bulb b) {
        b.setState(BulbManager.getInstance().getState(OffState.class));
    }
}
