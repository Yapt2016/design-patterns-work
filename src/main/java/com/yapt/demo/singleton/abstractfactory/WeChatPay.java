package com.yapt.demo.singleton.abstractfactory;

/**
 * @author hurui
 * @version Id: WeChatPay.java, v 0.1 2020/2/24 19:27 YaphetS Exp $$
 */
public class WeChatPay extends InsidePay{

    @Override
    public void pay() {
        System.out.println("欢迎使用微信支付");
    }
}