package com.niu.repository;

import com.niu.DTO.HeroListDTO;
import com.niu.dataobject.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
public interface HeroRepository extends JpaRepository<Hero,Integer> {

    /**通过类型查找英雄**/
    @Query(value = "SELECT * FROM hero WHERE type & ?1", nativeQuery=true)
    List<Hero> findByTypeIn(String type);

}
