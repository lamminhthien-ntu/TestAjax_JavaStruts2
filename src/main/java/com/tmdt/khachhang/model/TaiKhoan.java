package com.tmdt.khachhang.model;

import java.sql.Date;

public class TaiKhoan {
    private int id,ma_quyen;
    private String username, password, email, so_dien_thoai,gioi_tinh,so_lan_canh_cao,status;
    private Date ngay_tao, ngay_sinh;
    
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

}
