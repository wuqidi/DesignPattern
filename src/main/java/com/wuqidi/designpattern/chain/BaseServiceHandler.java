package com.wuqidi.designpattern.chain;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>基础服务类</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:29
 */
public abstract class BaseServiceHandler {
    private BaseServiceHandler nextBaseService;
    private int moneyLevel=0;

    public BaseServiceHandler(BaseServiceHandler nextBaseService, int moneyLevel) {
        this.nextBaseService = nextBaseService;
        this.moneyLevel = moneyLevel;
    }

    abstract void doSomething(Req req);

    void todo(Req req){
        if(req.getMoney()>moneyLevel){
            doSomething(req);
        }else{
            if(nextBaseService!=null){
                this.nextBaseService.todo(req);
            }else{
                System.out.println("没有美女服务了");
            }
        }
    }
}
