package com.wuqidi.designpattern.chain;

import lombok.Data;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:34
 */
@Data
public class Req {
    private int money;

    public Req(int money) {
        this.money = money;
    }
}
