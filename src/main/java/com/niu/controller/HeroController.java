package com.niu.controller;

import com.niu.VO.HeroListVO;
import com.niu.VO.ResponseVO;
import com.niu.dataobject.Hero;
import com.niu.dataobject.Inscription;
import com.niu.dataobject.Skill;
import com.niu.service.Impl.HeroServiceImpl;
import com.niu.service.Impl.InscriptionServiceImpl;
import com.niu.service.Impl.SkillServiceImpl;
import com.niu.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */

@RestController
@RequestMapping(value = "/")
public class HeroController {
    @Autowired
    private HeroServiceImpl heroService;

    @Autowired
    private SkillServiceImpl skillService;

    @Autowired
    private InscriptionServiceImpl inscriptionService;

    @PostMapping(value = "/addhero")
    public ResponseVO addHero(@Valid Hero hero, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(heroService.save(hero));
    }

    @GetMapping(value = "/herolist/{type}")
    public ResponseVO getHeroList(@PathVariable("type") String type) {
        List<Hero> heroList = heroService.findByType(type);
        List<HeroListVO> heroListVOList = new ArrayList<>();
        for (Hero hero : heroList) {
            HeroListVO heroListVO = new HeroListVO();
            heroListVO.setHeroId(hero.getId());
            heroListVO.setHeroName(hero.getHeroName());
            heroListVO.setType(hero.getType());
            heroListVO.setHeroPortrait(hero.getHeroPortrait());
            heroListVOList.add(heroListVO);
        }
        return ResponseUtil.success(heroListVOList);
    }

    @GetMapping(value = "/getonehero/{id}")
    public ResponseVO getOneHero(@PathVariable("id") Integer id) {
        //todo return one hero
        return ResponseUtil.success(heroService.findOneHeroById(id));
    }

    @Transactional
    @PostMapping(value = "/addskill")
    public ResponseVO addSkill(@RequestBody List<Skill> skills) {
        ResponseVO responseVO = new ResponseVO();
        for (Skill skill : skills) {
            skillService.save(skill);
        }
//        if (bindingResult.hasErrors()) {
//            return ResponseUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
//        }
        return responseVO;
    }


    public ResponseVO addInscription(@Valid Inscription inscription,BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResponseUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(inscriptionService.save(inscription));
    }

    public ResponseVO getInscription(@RequestParam("id") Integer id){
        return ResponseUtil.success(inscriptionService.findOne(id));
    }
}
