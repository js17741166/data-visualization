package com.yongche.visual;

/**
 * Created by caozhen on 2018/3/12
 */

/**
 * 服务端返回对象的封装
 */
public class WebReturnObject {

    public int status;
    public String msg;
    public Object data;

    @Override
    public String toString() {
        return "WebReturnObject{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public WebReturnObject() {
    }

    public WebReturnObject(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }



    /**
     * 成功时返回的对象
     * @param data 成功时返回的数据
     * @return
     */
    public  WebReturnObject getInstanceForSuccess(Object data) {
        WebReturnObject ret = new WebReturnObject();
        ret.status = 1000;
        ret.data = data;
        return ret;
    }

    /**
     * 错误时返回的对象
     * @param status
     * @param data
     * @param msg
     * @return
     */
    public  WebReturnObject getInstanceForError(int status, Object data, String msg) {
        WebReturnObject ret = new WebReturnObject();
        ret.status = status;
        ret.data = data;
        ret.msg = msg;
        return ret;
    }




}
