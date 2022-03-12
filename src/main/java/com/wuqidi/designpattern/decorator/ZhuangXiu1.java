package com.wuqidi.designpattern.decorator;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>装修公司1</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:58
 */
public class ZhuangXiu1 extends Decorator{
    public ZhuangXiu1(House house) {
        super(house);
    }

    @Override
    void goHome() {
        super.goHome();
        System.out.println(" 装修验收...");
    }
}
