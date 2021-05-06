package com.example.thi_m4.service.impl;

import com.example.thi_m4.model.DonHang;
import com.example.thi_m4.model.LoaiSanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LoaiSanPhamService {
    Page<LoaiSanPham> findAll(Pageable pageable);
    void save (LoaiSanPham loaiSanPham);
    void delete(String maLoaiSp);
    DonHang findById(String maloaiSp);

    Iterable<DonHang> findAll();
}
