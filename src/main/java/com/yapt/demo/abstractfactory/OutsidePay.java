package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: InsideRefund.java, v 0.1 2020/2/24 21:10 YaphetS Exp $$
 */
public class OutsidePay implements IPay{


    public void pay() {
        System.out.println("境外支付");
    }
}