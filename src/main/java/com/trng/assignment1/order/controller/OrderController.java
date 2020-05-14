package com.trng.assignment1.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.trng.assignment1.order.response.model.OrderLineItem;
import com.trng.assignment1.order.response.model.Orders;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	 @GetMapping(value="/{orderId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	  public ResponseEntity<Orders> getOrder(@PathVariable("orderId") String orderId) {
	       
		 	Orders orders=new Orders();
		 	ArrayList<OrderLineItem> returnorderlist=new ArrayList<OrderLineItem>();
		 	OrderLineItem firstorder=new OrderLineItem();
		 	firstorder.setOrderId("1");
		 	firstorder.setOrderAmount("250");
		 	firstorder.setOrderDate("14-Apr-2020");
		 	OrderLineItem secondorder=new OrderLineItem();
		 	secondorder.setOrderId("2");
		 	secondorder.setOrderAmount("450");
		 	secondorder.setOrderDate("15-Apr-2020");
		 	returnorderlist.add(firstorder);
		 	returnorderlist.add(secondorder);
		 	
		 	orders.setOrders(returnorderlist);
		 	
		         
	        return ResponseEntity.status(HttpStatus.OK).body(orders);
	    }

}
