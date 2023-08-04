package com.newdev.processing.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "babynames", name = "babyname")
@Data
@IdClass(BabyIdcls.class)
public class BabyEntity {

/*    @EmbeddedId
    BabyIdcls babyid;*/

    @Id
    private Integer byear;
    @Id
    private String bname;
    @Id
    private String gender;
    private int bcount;

    @Transient
    private int number;

}
