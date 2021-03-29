package controller;

import model.bean.employee.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action ="";
        }
        switch (action){
            case "create":
                createUser(request,response);
                break;
            case "update":
                break;
            case "delete":
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
//        String name=request.getParameter("name");
//        User user=null;
//        List<User> userList=new ArrayList<>();
//        user=new user();
//        List.add;
//        request.setAttribute("userList",userList);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("/customer/create.jsp");
        dispatcher.forward(request,response);
        String action = request.getParameter("acion");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                break;
            case "update":
                break;
            case "delete":
                break;
            default:

        }
    }
}
