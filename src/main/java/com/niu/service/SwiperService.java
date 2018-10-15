package com.niu.service;

import com.niu.dataobject.Swiper;

import java.util.List;

public interface SwiperService {

    List<Swiper> findAll();

    Swiper save(Swiper swiper);

    void delete(Integer id);

    Swiper findById(Integer id);
}
