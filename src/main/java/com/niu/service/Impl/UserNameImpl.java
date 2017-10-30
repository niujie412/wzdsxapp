package com.niu.service.Impl;

import com.niu.dataobject.UserName;
import com.niu.repository.UserNameRepository;
import com.niu.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class UserNameImpl implements UserNameService {

    @Autowired
    private UserNameRepository userNameRepository;

    @Override
    @Transactional
    public UserName save(UserName userName) {
        return userNameRepository.save(userName);
    }
}
