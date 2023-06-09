package top.qinhuajun.dict.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dicts")
public class DictController implements DictDoc {

    @Override
    @GetMapping(value = {""})
    public Result<Dict> queryDict(DictQuery query) {
        return new JsonResult<Dict>(1, "hello", new Dict("key", "value"));
    }

    @Override
    @GetMapping(value = {"/groups"})
    public Result<DictGroup> queryDictGroup(DictGroupQuery query) {
        return null;
    }
}
