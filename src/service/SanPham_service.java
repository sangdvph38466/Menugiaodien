/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;
import java.sql.*;

/**
 *
 * @author DNC
 */
public class SanPham_service implements SapPhamterface<SanPham>{

    private Connection conn;
    private List<SanPham> listNhanVien = new ArrayList();

    public SanPham_service() {
        try {
            conn = DBConnect.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SanPham> getAll() {
        try {
            String query = "select manv,hoten,matkhau,vaitro from nhanvien";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("manv");
                String ten = rs.getString("hoten");
                String mk = rs.getString("matkhau");
                String vt = rs.getString("vaitro");
               // SanPham nv = new SanPham (id, ten, mk, vt);
               // listNhanVien.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
    }

    @Override
    public void them(SanPham nv) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sua(SanPham nv, int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoa(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
