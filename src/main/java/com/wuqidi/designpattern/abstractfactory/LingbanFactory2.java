package com.wuqidi.designpattern.abstractfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 23:36
 */
public class LingbanFactory2 extends BaseAbstractFactory{
    public GaoJiService getInstance(Class<? extends BaseService> zlass) throws Exception {
        //这里就不判断了 try 啥的自己写
        if(!zlass.getSuperclass().equals(GaoJiService.class)){
            throw new RuntimeException("想消费高级服务请掏钱！");
        }
        Class<?> forName = Class.forName(zlass.getName());
        return (GaoJiService) forName.newInstance();
    }
}
