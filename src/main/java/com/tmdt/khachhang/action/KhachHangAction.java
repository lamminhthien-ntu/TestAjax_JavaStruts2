package com.tmdt.khachhang.action;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionSupport;
import com.thuctap.struts2_crud_mybatis.db.ConnectDB;
public class KhachHangAction extends ActionSupport{
    private int id,ma_quyen;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMa_quyen() {
        return ma_quyen;
    }

    public void setMa_quyen(int ma_quyen) {
        this.ma_quyen = ma_quyen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getSo_lan_canh_cao() {
        return so_lan_canh_cao;
    }

    public void setSo_lan_canh_cao(String so_lan_canh_cao) {
        this.so_lan_canh_cao = so_lan_canh_cao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getNgay_tao() {
        return ngay_tao;
    }

    public void setNgay_tao(Date ngay_tao) {
        this.ngay_tao = ngay_tao;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getGioi_thieu() {
        return gioi_thieu;
    }

    public void setGioi_thieu(String gioi_thieu) {
        this.gioi_thieu = gioi_thieu;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    private String username, password, email, so_dien_thoai,gioi_tinh,so_lan_canh_cao,status;
    private Date ngay_tao, ngay_sinh;
    private String  ten, dia_chi,gioi_thieu;
    private static final long serialVersionUID = 1L;
    
        // Tạo SQL_SESSION_FACTORY để chuẩn bị cho kết nối database
        SqlSessionFactory sqlSessionFactory = ConnectDB.getSqlSessionFactory();

        // Respone hay dùng cho AJAX và JSON
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();

        @Action(value = "/khachhang/registerSubmit", results = {
            @Result(name = "success", location = "index.html"),
    })
    public String registerSubmit() throws Exception {
        return SUCCESS;
    }
    
}
