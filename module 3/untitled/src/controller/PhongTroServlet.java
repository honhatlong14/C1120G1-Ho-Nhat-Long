package controller;

import model.bean.BenhNhan;
import model.service.benhNhanService;
import model.service.impl.BenhNhanServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "PhongTroServlet", urlPatterns = "/phongtro")
public class PhongTroServlet extends HttpServlet {
    model.service.benhNhanService.BenhNhanService benhNhanService = new BenhNhanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editBenhNhan(request, response);
                break;
        }
    }

    private void editBenhNhan(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String ngayNhap = request.getParameter("ngayNhap");
        String ngayRa = request.getParameter("ngayRa");
        String reason = request.getParameter("lyDo");
        try {
            benhNhanService.update(new BenhNhan(id, name, ngayNhap, ngayRa, reason));
            request.setAttribute("message","Updated BenhNhan !");
            listBenhNhan(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "edit":
                showEditBenhNhan(request, response);
                break;
            case "delete":
                deleteBenhNhan(request, response);
                break;
            default:
                listBenhNhan(request, response);
                break;
        }
    }

    private void deleteBenhNhan(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        try {
            benhNhanService.delete(id);
            request.setAttribute("message","Deleted BenhNhan !");
            listBenhNhan(request,response);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
//            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showEditBenhNhan(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        BenhNhan benhNhan = benhNhanService.findById(id);
        request.setAttribute("benhnhan", benhNhan);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benhnhan/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void listBenhNhan(HttpServletRequest request, HttpServletResponse response) {
        List<BenhNhan> listBenhNhan = benhNhanService.findAll();
        request.setAttribute("listBenhNhan", listBenhNhan);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benhnhan/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}