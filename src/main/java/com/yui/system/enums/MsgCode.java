package com.yui.system.enums;

import com.yui.system.annotation.EnumFieldInit;
import com.yui.system.annotation.EnumInit;

/**
 * @author XuZhuohao
 * @date 2020/3/23
 */
public interface MsgCode {
    class InitParam {
        EnumFieldInit enumFieldInit = null;
        EnumInit enumInit = null;
    }

    /**
     * @return
     */
    default int getCode() {
        final InitParam initParam = getInitParam();
        if (initParam.enumInit == null) {
            return initParam.enumFieldInit.code();
        }
        final String fieldCode = String.format("%04d", initParam.enumFieldInit.code());
        return Integer.valueOf(initParam.enumInit.preCode() + fieldCode);
    }


    default String getMsg() {
        final InitParam initParam = getInitParam();
        if (initParam.enumInit == null) {
            return initParam.enumFieldInit.msg();
        }
        return initParam.enumInit.preMsg() + "" + initParam.enumFieldInit.msg();
    }

    default InitParam getInitParam() {
        InitParam initParam = new InitParam();
        try {
            initParam.enumFieldInit = this.getClass().getField(this + "").getAnnotation(EnumFieldInit.class);
            initParam.enumInit = this.getClass().getAnnotation(EnumInit.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        if (initParam.enumFieldInit == null) {
            throw new RuntimeException("枚举异常：没有 EnumFieldInit 注解");
        }
        return initParam;
    }

}
