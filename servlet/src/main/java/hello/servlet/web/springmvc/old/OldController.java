package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/springmvc/old-controller") // spring bean Name
public class OldController implements Controller {
    /*
    OldController 를 실행하면서 사용된 객체는 다음과 같다.
        HandlerMapping = BeanNameUrlHandlerMapping
        HandlerAdapter = SimpleControllerHandlerAdapter
     */

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return null;
    }


}
