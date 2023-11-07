package com.customer.manage.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="pharma-retailer-service",url="http://localhost:8086",path="/api/retailer/v1/")
public interface CustomerClient {

}
