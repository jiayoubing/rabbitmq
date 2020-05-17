package com.infosys.china.server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.china.common.BaseApiService;
import com.infosys.china.common.ResponseBase;

@RestController
public class OrderController extends BaseApiService {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/addOrder")
    public ResponseBase addOrder() {
        return orderService.addOrderAndDispatch();
    }

}