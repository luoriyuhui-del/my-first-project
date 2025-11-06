package icom.it.heima.ui;

import javax.swing.*;


public class Test {
    public static void main(String[] args) {
        String code = VerificationCodeUtil.getVerificationCode();
        System.out.println(code);
    }
}
