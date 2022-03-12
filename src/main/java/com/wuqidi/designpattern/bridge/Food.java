package com.wuqidi.designpattern.bridge;

import lombok.Data;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:13
 */
@Data
public abstract class Food {
    private Brand brand;

    public Food(Brand brand) {
        this.brand = brand;
    }

    public void eat(){
        System.out.println("吃食物...");
        brand.show();
    }
}
