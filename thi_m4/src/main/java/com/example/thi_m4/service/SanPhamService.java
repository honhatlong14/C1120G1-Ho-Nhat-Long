package com.example.thi_m4.service.impl;

import com.example.thi_m4.model.SanPham;
import com.example.thi_m4.repository.SanPhamRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SanPhamService {
    Page<SanPham> findAll(Pageable pageable);
    void save(SanPham sanPham );
    Iterable<SanPham> findAll();
}
