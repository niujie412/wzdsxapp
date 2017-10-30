package com.niu.repository;

import com.niu.dataobject.Hero;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class HeroRepositoryTest {

    @Autowired
    private HeroRepository heroRepository;

    @Test
    public void findByTypeIn() throws Exception {
    }

    @Test
    public void add() throws Exception{
        Hero hero = new Hero();
        hero.setHeroName("123");
        hero.setHeroGold("13888");
//        hero.set
    }

}