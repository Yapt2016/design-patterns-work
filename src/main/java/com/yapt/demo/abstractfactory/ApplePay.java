package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: WeChatPay.java, v 0.1 2020/2/24 19:27 YaphetS Exp $$
 */
public class ApplePay implements IPay,IRefund {

    public void pay() {
        System.out.println("欢迎使用苹果支付");
    }

    public void refund() {
        System.out.println("欢迎使用苹果退款");
    }
}