package top.qinhuajun.dict.apis;

import lombok.Getter;

@Getter
public class JsonResult<T> implements Result<T> {

    int code;

    String message;

    T data;

    public JsonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
