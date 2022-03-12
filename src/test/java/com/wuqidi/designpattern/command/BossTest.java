package com.wuqidi.designpattern.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 0:25
 */
class BossTest {

    @Test
    void play() {
        KTVService ktvService = new KTVService();
        Command command = new Command(ktvService);
        Boss boss = new Boss(command);
        boss.play();
    }
}