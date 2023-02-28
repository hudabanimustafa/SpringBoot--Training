package com.hudabanimustafa.pos.pos.controller;


import com.hudabanimustafa.pos.pos.dao.OrderDao;
import com.hudabanimustafa.pos.pos.dao.SaleDao;
import com.hudabanimustafa.pos.pos.dto.OrderDto;
import com.hudabanimustafa.pos.pos.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private SaleDao saleDao;


    @PostMapping(path = "/saveOrder")
    public OrderEntity saveOrder(@RequestBody List<OrderDto> orderDto) {
        return this.saleDao.saveSale(orderDto);
    }
    @GetMapping(path = "/get-orders")
    public List<OrderEntity> getAllOrders(){
        return this.orderDao.getAllOrders();
    }
}
