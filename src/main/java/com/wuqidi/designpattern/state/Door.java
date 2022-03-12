package com.wuqidi.designpattern.state;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:33
 */
public class Door {
    public static final State open  = new OpenState();
    public static final State close = new CloseState();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public Door(State currentState) {
        this.currentState = currentState;
        this.currentState.setDoor(this);
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setDoor(this);
    }

    public void close(){
        this.currentState.setClose();
    }

    public void open(){
        this.currentState.setOpen();
    }


}
