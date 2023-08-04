package com.newdev.processing.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
public class BabyIdcls implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer byear;
    private String bname;
    private String gender;
}

/*@Embeddable
@Data
public class BabyIdcls implements Serializable{

    private Integer byear;
    private String bname;
    private String gender;
}*/
