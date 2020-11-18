package com.tcc.simple.example.tcc.store.service.provider.repository;

import com.tcc.simple.example.tcc.store.service.provider.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity,Long> {
}
