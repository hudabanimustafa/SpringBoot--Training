package com.hudabanimustafa.pos.pos.repository;

import com.hudabanimustafa.pos.pos.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {
}
