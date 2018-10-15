package com.niu.service;

import com.niu.dataobject.Inscription;

public interface InscriptionService {
    Inscription save(Inscription inscription);

    Inscription findOne(Integer id);

}
