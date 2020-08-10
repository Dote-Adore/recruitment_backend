package com.doteadore.recruitment_backend.common.mybatisplus;

import java.io.Serializable;
import java.util.Optional;
// 这里直接copy mybatis的源码，作为api返回
public class R<T> implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public void setCode(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    /**
     * 业务错误码
     */
    private long code;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    /**
     * 结果集
     */
    private T data;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * 描述
     */
    private String msg;

    public R() {
        // to do nothing
    }

    public R(IErrorCode errorCode) {
        errorCode = Optional.ofNullable(errorCode).orElse(ApiErrorCode.FAILED);
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public static <T> R<T> ok(T data) {
        ApiErrorCode aec = ApiErrorCode.SUCCESS;
        if (data instanceof Boolean && Boolean.FALSE.equals(data)) {
            aec = ApiErrorCode.FAILED;
        }
        return restResult(data, aec);
    }

    public static <T> R<T> failed(String msg) {
        return restResult(null, ApiErrorCode.FAILED.getCode(), msg);
    }

    public static <T> R<T> failed(IErrorCode errorCode) {
        return restResult(null, errorCode);
    }

    public static <T> R<T> restResult(T data, IErrorCode errorCode) {
        return restResult(data, errorCode.getCode(), errorCode.getMsg());
    }

    private static <T> R<T> restResult(T data, long code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public boolean ok() {
        return ApiErrorCode.SUCCESS.getCode() == code;
    }

    /**
     * 服务间调用非业务正常，异常直接释放
     */
    public T serviceData() {
        if (!ok()) {
            throw new ApiException(this.msg);
        }
        return data;
    }
}