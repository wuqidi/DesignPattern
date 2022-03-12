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
public class OpenState extends State{
    @Override
    void setOpen() {
        System.out.println("门已经处于打开状态。。。");
    }

    @Override
    void setClose() {
        //super.door.getCurrentState()//我们可以获取当前门的一个状态来进行关闭前的一个判断
        super.door.setCurrentState(Door.close);
        System.out.println("关闭大门");
    }
}