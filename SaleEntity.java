package com.hudabanimustafa.pos.pos.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Table(name = "sales")
@Data
@Entity
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Integer saleId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orderId;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;


}
