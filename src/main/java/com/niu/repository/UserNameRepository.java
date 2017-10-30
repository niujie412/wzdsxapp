package com.niu.repository;

import com.niu.dataobject.UserName;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserNameRepository extends JpaRepository<UserName,Integer> {

}
