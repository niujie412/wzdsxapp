package com.niu.dataobject;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserName {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 5)
    private String userName;

    private String passWord;

    public UserName(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public UserName() {
    }
}
