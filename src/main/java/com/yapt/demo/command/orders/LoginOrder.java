package com.yapt.demo.command.orders;

import com.yapt.demo.command.FtpService;
import com.yapt.demo.command.Order;

/**
 * @author hurui
 * @version Id: OpenOrder.java, v 0.1 2020/3/21 15:39 YaphetS Exp $$
 */
public class LoginOrder implements Order {

    private FtpService ftpService;

    public LoginOrder(FtpService ftpService){
        this.ftpService =ftpService;
    }

    @Override
    public void execute() {
        ftpService.login();
    }
}