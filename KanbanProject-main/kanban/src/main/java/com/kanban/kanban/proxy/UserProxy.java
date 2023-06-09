package com.kanban.kanban.proxy;

import com.kanban.kanban.domain.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth-service", url = "http://auth-service:3033")
public interface UserProxy {

    @PostMapping("/api/v1/auth/addUser")
    ResponseEntity<?> addNewUser(@RequestBody EmployeeDTO employeeDTO);

}
