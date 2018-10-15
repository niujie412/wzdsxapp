package com.niu.controller;

import com.niu.VO.ResponseVO;
import com.niu.dataobject.Equipment;
import com.niu.service.Impl.EquipmentServiceImpl;
import com.niu.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentServiceImpl equipmentService;

    @GetMapping(value = "/getequips")
    public ResponseVO getEquipments(){
        return ResponseUtil.success(equipmentService.findAll());
    }

    @GetMapping(value = "/getoneequip/{id}")
    public ResponseVO getEquipment(@PathVariable("id") Integer id){
        return ResponseUtil.success(equipmentService.findOne(id));
    }

    @PostMapping(value = "/addEquipment")
    public ResponseVO addEquipment(@Valid Equipment equipment,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ResponseUtil.error(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(equipmentService.save(equipment));
    }
}
