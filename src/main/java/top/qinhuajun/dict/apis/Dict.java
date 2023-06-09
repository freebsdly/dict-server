package top.qinhuajun.dict.apis;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Dict implements Serializable {
    String key;
    String name;
    DictGroup group;
    Dict parent;

    public Dict(String key, String value) {
        this.key = key;
        this.name = value;
    }
}
