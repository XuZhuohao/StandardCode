package com.yui.system.enums;

import com.yui.system.enums.annotation.EnumFieldInit;
import com.yui.system.enums.annotation.EnumInit;

/**
 * @author XuZhuohao
 * @date 2020/3/23
 */
public interface Code {

    enum General implements MsgCode {
        /**
         *
         */
        @EnumFieldInit(code = 0, msg = "成功") success,
        @EnumFieldInit(code = 1, msg = "不能识别异常") unknown,
        ;
    }

    @EnumInit(preCode = 4, preMsg = "客户端提示：")
    enum Client implements MsgCode {
        /**
         *
         */
        @EnumFieldInit(code = 34, msg = "连接异常") linkErr,
        ;
    }

    @EnumInit(preCode = 3, preMsg = "服务端提示：")
    enum Server implements MsgCode {
        /**
         *
         */
        @EnumFieldInit(code = 34, msg = "连接异常") linkErr,
        ;
    }


}
