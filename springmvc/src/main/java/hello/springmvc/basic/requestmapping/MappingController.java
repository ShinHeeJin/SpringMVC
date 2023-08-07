package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class MappingController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping(value = {"/hello-basic", "/hello-go"})
    public String helloBasic() {
        log.info("helloBasic");
        return "helloBasic";
    }

    @GetMapping("/user/{userId}/product/{productId}")
    public String mappingPath(@PathVariable String userId, @PathVariable String productId) {
        return "userId = " + userId + " / product = " + productId;
    }

    // 특정 파라미터 조건 매핑 ( exactly )
    @GetMapping(value = "/mapping-param", params = {"mode=debug", "config=testing"})
    public String mappingParam(@RequestParam String mode, @RequestParam String config) {
        return mode + " / " + config;
    }

    // 특정 해더 조건 매핑
    @GetMapping(value = "/mapping-header", headers = {"mode=debug"})
    public String mappingHeader() {
        return "ok";
    }

    // 미디어 타입조건 매핑 ( consume ) -> ContentType
    @PostMapping(value = "/mapping-consume", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String mappingConsume() {
        return "ok";
    }

    // 미디어 타입조건 매핑 ( consume ) -> Accept
    @PostMapping(value = "/mapping-produce", produces = MediaType.TEXT_HTML_VALUE)
    public String mappingProduce() {
        return "ok";
    }
}
