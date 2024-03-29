package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/view/new-form.jsp";  // -> /WEB-INF 안에 있으면 외부에서 jsp 파일을 직접적으로 부를 수 없다.
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);// 컨트롤러에서 뷰로 이동할 때 사용
        dispatcher.forward(request, response); // 다른 서블릿이나 JSP로 이동할 수 있는 기능. 서버 내부에서 다시 호출 발생(클라에 다시 갔다오는 리다이렉트가 아님)
    }
}
