package com.ssm.bridge;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 15:01
 */
public class Client {
    public static void main(String[] args) {
        Phone oppo = new FoldedPhone(new Oppo());
        oppo.open();
        oppo.call();
        oppo.close();

        Phone vivo = new FoldedPhone(new Vivo());
        vivo.open();
        vivo.call();
        vivo.close();

    }
}
