package com.aidijing.controller;

import com.aidijing.order.domain.Order;
import com.aidijing.order.service.OrderService;
import com.aidijing.user.domain.User;
import com.aidijing.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 披荆斩棘
 * @date : 2017/9/8
 */
@RestController
public class DemoController {

    @Autowired
    private UserService  userService;
    @Autowired
    private OrderService orderService;


    @GetMapping( "users" )
    public ResponseEntity< List< User > > listUser () {
        return ResponseEntity.ok( userService.list() );
    }

    @GetMapping( "orders" )
    public ResponseEntity< List< Order > > listOrder () {
        return ResponseEntity.ok( orderService.list() );
    }

}
