/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SanPham;

/**
 *
 * @author DNC
 */
public interface SapPhamterface<T> {
      List<T> getAll();

    void them(SanPham nv) throws Exception;

    void sua(SanPham nv, int id) throws Exception;

    void xoa(int id) throws Exception;
}
