package com.niu.repository;

import com.niu.dataobject.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill,Integer>{
    List<Skill> findByHeroId(String heroId);
}
