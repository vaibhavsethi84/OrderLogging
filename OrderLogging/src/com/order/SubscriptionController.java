package com.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.utils.LoggerUtils;

@Controller
public class SubscriptionController {
	
	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	public String subscribe(HttpServletRequest request, @ModelAttribute("SpringWeb")Subscription subscription) {
		//...
		LoggerUtils.log("Starting Subs");
		String orderDetails = subscription.getOrderDetails();
		String truncatedOrderDetails = LoggerUtils.truncate(orderDetails, 250);
		LoggerUtils.log(truncatedOrderDetails);
		return "success";
		//...
	}
	
}
