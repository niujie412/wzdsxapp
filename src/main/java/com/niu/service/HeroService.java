package com.niu.service;

import com.niu.dataobject.Hero;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
public interface HeroService {

    List<Hero> findByType(String type);

    List<Hero> findAll();

    @Transactional
    Hero save(Hero hero);

    Hero findOneHeroById(Integer id);
}
