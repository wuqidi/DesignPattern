package com.wuqidi.designpattern.prototype;

import lombok.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/11 0:32
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LaLaLa implements Cloneable{
    private int age;//浅拷贝就能解决
    private String name;//浅拷贝的时候 常量池中 使用的时候才在内存创建
    private String[] arr;//数组 需要深拷贝
    private Long mm;//这里编译器会进行优化 进行拆箱
    //引用类型 需要深拷贝


    @Override
    protected LaLaLa clone() throws CloneNotSupportedException {
        LaLaLa la = (LaLaLa)super.clone();//浅拷贝
        //this.mm.clone();
        la.setArr(this.getArr().clone());
        return la;
    }
}
