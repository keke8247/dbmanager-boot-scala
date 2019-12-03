package com.wdk.util;

/**
 * @Description:
 * @Author:wang_dk
 * @Date:2019/12/3 0003 21:39
 * @Version: v1.0
 **/

public class ResponseUtil {
    public static ResponseMode success(){
        return success(null);
    }

    public static ResponseMode success(Object data){
        ResponseMode responseMode = new ResponseMode();
        responseMode.setCode(200);
        responseMode.setMsg("请求成功");
        responseMode.setData(data);
        return responseMode;
    }

    public static ResponseMode error(Integer code,String msg){
        ResponseMode responseMode = new ResponseMode();
        responseMode.setCode(code);
        responseMode.setMsg(msg);
        responseMode.setData(null);
        return responseMode;
    }

}
