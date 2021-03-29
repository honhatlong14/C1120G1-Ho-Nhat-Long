package controller;

import model.PhongTro;
import service.PhongTroService;
import service.PhongTroServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PhongTroServlet",urlPatterns = "")
public class PhongTroServlet extends HttpServlet {

    PhongTroService phongTroService = new PhongTroServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionUser");
        if (action.equals("addPhongTro")) {
            addPhongTro(request, response);
        } else if (action.equals("listPhongTro")) {
            showListPhongTroByDate(request, response);
        }
    }

    private void showListPhongTroByDate(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        request.setAttribute("listProduct",phongTroService.findByDate(start,end));
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionUser");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "listProduct":
                showListPhongTro(request, response);
                break;
            case "addPhongTro":
                showAddPhongTro(request, response);
                break;
            default:
                showHome(request, response);
        }
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }


    private void showListPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listPhongTro", phongTroService.findAll());
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void addPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String ten_nguoi_thue = request.getParameter("ten_nguoi_thue");
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String ngay_bat_dau_thue = request.getParameter("ngay_bat_dau_thue");
        String hinh_thuc_thanh_toan = request.getParameter("hinh_thuc_thanh_toan");


        PhongTro phongTro = new PhongTro(id, ten_nguoi_thue, so_dien_thoai, ngay_bat_dau_thue, hinh_thuc_thanh_toan);
        String msg = phongTroService.addPhongTro(phongTro);

        request.setAttribute("msgDisplay", msg);

        if (msg.equals("OK")) {
            showListPhongTro(request, response);
        } else {
            showAddPhongTro(request, response);
        }
    }

    private void showAddPhongTro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }
}
