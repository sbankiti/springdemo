package com.newdev.processing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BabyDto {
    private int byear;
    private String bname;
    private String gender;
    private int bcount;
}
