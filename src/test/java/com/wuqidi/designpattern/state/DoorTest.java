package com.wuqidi.designpattern.state;

import org.junit.jupiter.api.Test;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:58
 */
class DoorTest {

    @Test
    void test1() {
        CloseState intiState = new CloseState();
        Door door = new Door(intiState);
        door.close();


        door.open();
        door.open();


        door.close();
    }
}