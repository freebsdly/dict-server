package top.qinhuajun.dict.apis;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DictQuery implements Serializable {

    @Parameter(description = "字典名称", example = "city", in = ParameterIn.QUERY)
    String key;

    @Parameter(description = "字典值", example = "城市", in = ParameterIn.QUERY)
    String name;
}
