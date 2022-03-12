package com.wuqidi.designpattern.chain;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>美女3</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:30
 */
public class Girl3 extends BaseServiceHandler{

    public Girl3(BaseServiceHandler nextBaseService) {
        super(nextBaseService, 5);
    }

    @Override
    void doSomething(Req req) {
        System.out.println("美女3号前来服务...");
    }
}