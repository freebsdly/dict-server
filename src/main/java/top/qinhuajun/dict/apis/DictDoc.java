package top.qinhuajun.dict.apis;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;

@Tag(name = "字典服务", description = "同意字典服务接口")
public interface DictDoc {

    @Operation(summary = "查询字典详情", description = "按照指定查询条件查询字典详情")
    Result<Dict> queryDict(@ParameterObject DictQuery query);

    @Operation(summary = "查询字典组详情", description = "按照指定查询条件查询字典组详情")
    Result<DictGroup> queryDictGroup(@ParameterObject DictGroupQuery query);
}
