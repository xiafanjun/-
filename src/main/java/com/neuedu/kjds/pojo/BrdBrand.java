package com.neuedu.kjds.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class BrdBrand {
    private Integer brdId;

    private Integer manId;

    private String nameEn;

    private String nameCn;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private Integer callCnt;

    private String remark;

    private String stsCd;

}