package top.qinhuajun.dict.apis;

import java.io.Serializable;

public interface Result<T> extends Serializable {

    int getCode();

    String getMessage();

    T getData();
}
