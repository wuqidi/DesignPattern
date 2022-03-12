package com.wuqidi.designpattern.chain;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>美女1</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:30
 */
public class Girl1 extends BaseServiceHandler{

    public Girl1(BaseServiceHandler nextBaseService) {
        super(nextBaseService, 10);
    }

    @Override
    void doSomething(Req req) {
        System.out.println("美女1号前来服务...");
    }
}
