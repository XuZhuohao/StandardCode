package com.yui.system.enums;

/**
 * @author XuZhuohao
 * @date 2020/3/23
 */
public class TestMsg {
    public static void main(String[] args) {
        System.out.println(Code.General.success.getCode());
        System.out.println(Code.General.success.getMsg());
        System.out.println(Code.Client.linkErr.getCode());
        System.out.println(Code.Client.linkErr.getMsg());
        System.out.println(Code.Server.linkErr.getCode());
        System.out.println(Code.Server.linkErr.getMsg());
    }
}
