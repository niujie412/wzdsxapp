package com.niu.service;

import com.niu.dataobject.Equipment;

import java.util.List;

public interface EquipmentService {

    List<Equipment> findByTypeIn(Integer type);

    List<Equipment> findAll();

    Equipment findOne(Integer id);

    Equipment save(Equipment equipment);
}
