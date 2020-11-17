package com.tcc.simple.example.tcc.order.serivce.provider.repository;

import com.tcc.simple.example.tcc.order.serivce.provider.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
