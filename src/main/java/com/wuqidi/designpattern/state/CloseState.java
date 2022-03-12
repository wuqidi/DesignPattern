package com.wuqidi.designpattern.state;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:35
 */
public class CloseState extends State{

    @Override
    void setOpen() {
        super.door.setCurrentState(Door.open);
        System.out.println("打开大门");
    }

    @Override
    void setClose() {
        System.out.println("大门已经处于关闭状态");
    }
}
