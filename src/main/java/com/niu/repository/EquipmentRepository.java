package com.niu.repository;

import com.niu.dataobject.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment,Integer>{

    @Query(value = "SELECT * FROM equipment WHERE type & ?1", nativeQuery=true)
    List<Equipment> findByTypeIn(Integer type);
}
