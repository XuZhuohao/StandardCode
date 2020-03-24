package com.yui.system.enums.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 枚举初始值注解
 * {@link com.yui.system.enums.MsgCode}
 *
 * @author XuZhuohao
 * @date 2020/3/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EnumFieldInit {

    int code();

    String msg();

}
