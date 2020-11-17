package com.tcc.simple.example.tcc.order.serivce.provider.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "t_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date orderCreateTime;
    private Integer orderStatus;
    private Integer orderStatusExt;


}
