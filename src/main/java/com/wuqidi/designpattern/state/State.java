package com.wuqidi.designpattern.state;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:32
 */
public abstract class State {
    protected Door door;

    public void setDoor(Door door) {
        this.door = door;
    }

    abstract void setOpen();
    abstract void setClose();
}
