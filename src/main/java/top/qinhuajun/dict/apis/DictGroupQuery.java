package top.qinhuajun.dict.apis;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class DictGroupQuery implements Serializable {

    @Parameter(description = "字典组名称，支持数组方式传参", example = "group1,group2", in = ParameterIn.QUERY)
    List<String> names;

    @Parameter(description = "字典组描述", example = "group1 description", in = ParameterIn.QUERY)
    String description;

    @Parameter(description = "字典名称", example = "key1", in = ParameterIn.QUERY)
    String dictKey;

    @Parameter(description = "字典名称", example = "key1", in = ParameterIn.QUERY)
    String dictName;
}
