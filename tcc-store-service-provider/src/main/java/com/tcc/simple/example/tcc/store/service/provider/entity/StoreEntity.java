package com.tcc.simple.example.tcc.store.service.provider.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_store")
public class StoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long storeAllCount;

    private Integer storeCountExt;




}
