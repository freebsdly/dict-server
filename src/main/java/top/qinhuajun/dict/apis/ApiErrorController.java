package top.qinhuajun.dict.apis;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiErrorController implements ErrorController {

    @GetMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
    Result<String> error() {
        return new JsonResult<>(404, "not found", "not exist");
    }
}
