package top.qinhuajun.dict.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dicts")
public class DictController {

    @GetMapping(value = {"", "/"})
    Result<Dict> queryDict() {
        return new JsonResult<Dict>(1, "hello", new Dict("key", "value"));
    }
}
