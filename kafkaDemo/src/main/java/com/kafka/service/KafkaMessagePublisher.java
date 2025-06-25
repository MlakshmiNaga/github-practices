package com.kafka.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;


@Service
public class KafkaMessagePublisher {
	
	@Autowired
	private KafkaTemplate<String, Object> template;
	
	public void sendMessageToTopic(String messsgae)
	{
		  CompletableFuture<SendResult<String,Object>> future = template.send("Java", messsgae);
		  future.whenComplete((result,ex)->{
			  if(ex == null) {
				  System.out.println("Sent Message=["+messsgae +"] with offset=["+result.getRecordMetadata().offset()+"]");
			  }else {
				  System.out.println("Unable to send message=["+messsgae +"] due to "+ ex.getMessage());  
			  }
			  
		  }	);  
		  
	}
}
