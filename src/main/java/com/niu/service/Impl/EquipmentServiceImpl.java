package com.niu.service.Impl;

import com.niu.dataobject.Equipment;
import com.niu.repository.EquipmentRepository;
import com.niu.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EquipmentServiceImpl implements EquipmentService{

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public List<Equipment> findByTypeIn(Integer type) {
        return equipmentRepository.findByTypeIn(type);
    }

    @Override
    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }

    @Override
    public Equipment findOne(Integer id) {
        return equipmentRepository.findOne(id);
    }

    @Override
    public Equipment save(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
}
