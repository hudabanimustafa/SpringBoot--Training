package com.hudabanimustafa.pos.pos.entity;


import lombok.Data;

import javax.persistence.*;

@Table(name = "orders")
@Data
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "total")
    private Double total;

}


