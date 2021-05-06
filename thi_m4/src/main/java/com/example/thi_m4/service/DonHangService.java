package com.example.thi_m4.service.impl;

import com.example.thi_m4.model.DonHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DonHangService {
    Page<DonHang> findAll(Pageable pageable);
    void save (DonHang donHang);
    void delete(String donHang);
    DonHang findById(String maDonHang);

    Iterable<DonHang> findAll();
    Page<DonHang> findAllByLoaiSanPham_TenLoaiSp(String tenSp, String loaiSp, Pageable pageable);
}
