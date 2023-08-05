package hello.servlet.basic.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
http://localhost:8080/request-param?username=hello&age=20&username=hello2
 */

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameterNames().asIterator().forEachRemaining(name -> System.out.println(name + " = " + req.getParameter(name)));

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        String age = req.getParameter("age");
        System.out.println("age = " + age);

        String[] usernames = req.getParameterValues("username");
        for (String s : usernames) {
            System.out.println("username = " + s);
        }
        resp.getWriter().write("ok");

    }
}
