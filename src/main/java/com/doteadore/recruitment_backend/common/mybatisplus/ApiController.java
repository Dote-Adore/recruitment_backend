package com.doteadore.recruitment_backend.common.mybatisplus;
// 这是mybatisplus的代码

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public ApiController() {
    }

    protected <T> R<T> success(T data) {
        return R.ok(data);
    }

    protected <T> R<T> failed(String msg) {
        return R.failed(msg);
    }

    protected <T> R<T> failed(IErrorCode errorCode) {
        return R.failed(errorCode);
    }
}
