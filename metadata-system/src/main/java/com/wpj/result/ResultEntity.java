package com.wpj.result;

/**
 * @author WuPeiJie
 * @version 1.0
 *
**/
public class ResultEntity<T> {

    private static final String SUCCESS = "SUCCESS";
    private static final String FAIL = "FAIL";
    private static final String NO_MSG = null;

    private static final String MSG_SUCCESS = "操作成功";
    private static final String MSG_FAIL = "操作失败";
    private static final String NO_URL = null;

    /**
     * 错误信息
     */
    private String msg;
    /**
     * 状态
     */
    private String state;
    /**
     * 数据
     */
    private T data;
    /**
     * 跳转的路径
     */
    private String url;

    public ResultEntity() {
    }

    public ResultEntity(String msg, String state, T data, String url) {
        this.msg = msg;
        this.state = state;
        this.data = data;
        this.url = url;
    }

    /**
     * 操作失败 [提示失败数据 'FAIL' 没有数据响应过去 没有路径跳转]
     * @param <T>  泛型
     * @return 封装数据对象
     */
    public static <T> ResultEntity<T> fall() {
        return new ResultEntity<T>(MSG_FAIL, FAIL, null, NO_URL);
    }

    /**
     * 操作失败 [提示失败数据 'FAIL' 没有数据响应过去 没有路径跳转]
     * @param msg 失败提示信息
     * @param <T> 泛型
     * @return 封装数据对象
     */
    public static <T> ResultEntity<T> fall(String msg) {
        return new ResultEntity<T>(msg, FAIL, null, NO_URL);
    }


    /**
     * 操作成功 [提示成功数据 'SUCCESS' 没有数据响应过去 没有路径跳转]
     * @param <T> 泛型
     * @return 封装数据对象
     */
    public static <T> ResultEntity<T> success() {
        return new ResultEntity<T>(MSG_SUCCESS, SUCCESS, null, NO_URL);
    }

    /**
     * 操作成功 [提示成功数据 'SUCCESS' 响应数据过去 没有路径跳转]
     * @param <T> 泛型
     * @return 封装数据对象
     */
    public static <T> ResultEntity<T> success(T data) {
        return new ResultEntity<T>(MSG_SUCCESS, SUCCESS, data, null);
    }
    /**
     * 操作成功 [提示成功数据 'SUCCESS' 没有数据响应过去 跳转到对应路径]
     * @param url 操作成功后跳转url
     * @param <T> 泛型
     * @return 封装数据对象
     */
    public static <T> ResultEntity<T> success(String url) {
        return new ResultEntity<T>(MSG_SUCCESS, SUCCESS, null, url);
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
