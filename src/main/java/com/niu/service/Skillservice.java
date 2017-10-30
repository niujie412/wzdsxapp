package com.niu.service;

import com.niu.dataobject.Skill;
import javax.transaction.Transactional;
import java.util.List;

public interface Skillservice {

    List<Skill> findByHeroId(String heroId);

    @Transactional
    Skill save(Skill skill);

}
