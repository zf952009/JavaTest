package in.itcast.servlet;

import in.itcast.domain.Regular;
import in.itcast.service.RegularSerivce;
import in.itcast.service.impl.RegularSerivceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RegularServlet", urlPatterns = "/RegularServlet")
public class RegularServlet extends HttpServlet {
    RegularSerivce regularSerivce = new RegularSerivceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        List<Regular> all = regularSerivce.getAll();
        request.setAttribute("list",all);
        request.getRequestDispatcher("/lsit_web.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}