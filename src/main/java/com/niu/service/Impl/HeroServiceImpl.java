package com.niu.service.Impl;

import com.niu.DTO.HeroListDTO;
import com.niu.dataobject.Hero;
import com.niu.repository.HeroRepository;
import com.niu.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroRepository repository;


    @Override
    public List<Hero> findByType(String type) {
        return repository.findByTypeIn(type);
    }

    @Override
    public List<Hero> findAll() {
        return repository.findAll();
    }

    @Override
    public Hero save(Hero hero) {
        return repository.save(hero);
    }

    @Override
    public Hero findOneHeroById(Integer id) {
        return repository.findOne(id);
    }
}
