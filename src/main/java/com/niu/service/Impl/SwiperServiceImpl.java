package com.niu.service.Impl;

import com.niu.dataobject.Swiper;
import com.niu.repository.SwiperRepository;
import com.niu.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwiperServiceImpl implements SwiperService{

    @Autowired
    private SwiperRepository repository;

    @Override
    public List<Swiper> findAll() {
        return repository.findAll();
    }

    @Override
    public Swiper save(Swiper swiper) {
        return repository.save(swiper);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }

    @Override
    public Swiper findById(Integer id) {
        return repository.findOne(id);
    }
}
