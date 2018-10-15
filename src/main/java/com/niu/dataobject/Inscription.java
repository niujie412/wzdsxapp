package com.niu.dataobject;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Inscription {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer heroId;

    private String blueInscriptionName;

    private String blueInscriptionDes;

    private String blueInscriptionImgUrl;

    private String greenInscriptionName;

    private String greenInscriptionDes;

    private String greenInscriptionImgUrl;

    private String redInscriptionName;

    private String redInscriptionDes;

    private String redInscriptionImgUrl;

}
