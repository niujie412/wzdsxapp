package com.niu.service.Impl;

import com.niu.dataobject.Skill;
import com.niu.repository.SkillRepository;
import com.niu.service.Skillservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class SkillServiceImpl implements Skillservice {

    @Autowired
    private SkillRepository repository;

    @Override
    public List<Skill> findByHeroId(String heroId) {
        return repository.findByHeroId(heroId);
    }

    @Override
    @Transactional
    public Skill save(Skill skill) {
        return repository.save(skill);
    }
}
