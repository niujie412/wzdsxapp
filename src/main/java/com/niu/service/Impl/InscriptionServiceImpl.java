package com.niu.service.Impl;

import com.niu.dataobject.Inscription;
import com.niu.repository.InscriptionRespository;
import com.niu.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionServiceImpl implements InscriptionService {

    @Autowired
    private InscriptionRespository respository;

    @Override
    public Inscription save(Inscription inscription) {
        return respository.save(inscription);
    }

    @Override
    public Inscription findOne(Integer id) {
        return respository.findOne(id);
    }
}
