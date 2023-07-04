package com.neuedu.kjds.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/*
 * @description: TODO
 * @author: Venture
 * @date: 2023-07-04 8:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Integer saoid;
    private String title;
    private BigDecimal price;
    private Integer qty;
    private String skucd;
    private Date creationdate;
    private String orderno;
    private String trackingno;
}
