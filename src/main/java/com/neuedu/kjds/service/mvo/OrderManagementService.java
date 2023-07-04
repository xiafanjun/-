package com.neuedu.kjds.service.mvo;/*
 * @author: Venture
 * @description: TODO
 */

import com.neuedu.kjds.util.KJDSResult;

public interface OrderManagementService {
    KJDSResult getUnpaymentOrder(int size,int current);

    KJDSResult getUndeliverOrder(int size, int current);


    KJDSResult dodeliver(int saoid);
}
