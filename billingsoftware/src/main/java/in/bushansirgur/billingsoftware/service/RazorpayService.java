package com.nmtanusha.billingsoftware.service;

import com.razorpay.RazorpayException;
import com.nmtanusha.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
