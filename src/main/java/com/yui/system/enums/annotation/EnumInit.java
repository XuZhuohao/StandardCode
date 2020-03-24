package com.yui.system.enums.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 枚举处理注解
 * {@link com.yui.system.enums.MsgCode}
 *
 * @author XuZhuohao
 * @date 2020/3/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnumInit {

    int preCode();

    String preMsg() default "";

}
