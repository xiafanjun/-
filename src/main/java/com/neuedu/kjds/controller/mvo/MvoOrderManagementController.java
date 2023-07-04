package com.neuedu.kjds.controller.mvo;

import com.neuedu.kjds.service.mvo.OrderManagementService;
import com.neuedu.kjds.util.KJDSResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mvoorder")
public class MvoOrderManagementController {
    @Autowired
    OrderManagementService orderManagementService;

    @RequestMapping("/unpayment/{size}/{current}")
    public KJDSResult unpayment(@PathVariable int size,@PathVariable int current){
        return orderManagementService.getUnpaymentOrder(size,current);
    }

    @RequestMapping("/undeliver/{size}/{current}")
    public KJDSResult undeliver(@PathVariable int size,@PathVariable int current){
        return orderManagementService.getUndeliverOrder(size,current);
    }

    @RequestMapping("/dodeliver/{saoid}")
    public KJDSResult dodeliver(@PathVariable int saoid){
        return orderManagementService.dodeliver(saoid);
    }
}
