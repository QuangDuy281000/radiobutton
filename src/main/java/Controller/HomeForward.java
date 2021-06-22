package Controller;

import Bean.Question;
import Dao.RadioDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/HomeForward")
public class HomeForward extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Question> list = RadioDao.DisplayQuestion();

        request.setAttribute("listquestion",list);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Home.jsp");
        rd.forward(request,response);
    }
}
