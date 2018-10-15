package com.niu.controller;

import com.niu.VO.ResponseVO;
import com.niu.dataobject.Inscription;
import com.niu.service.Impl.InscriptionServiceImpl;
import com.niu.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/inscription")
public class InscriptionController {

    @Autowired
    private InscriptionServiceImpl inscriptionService;

    @PostMapping(value = "/addInscription")
    public ResponseVO addIns(@Valid Inscription inscription, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ResponseUtil.error(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(inscriptionService.save(inscription));
    }

    @GetMapping(value = "/getOneIns")
    public ResponseVO getInscription(@PathVariable("id") Integer id){
        return ResponseUtil.success(inscriptionService.findOne(id));
    }

}
