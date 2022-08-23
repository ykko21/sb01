package org.ykko21.sb01.helloworldservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.websocket.server.PathParam;
import java.util.*;

@RestController
@RequestMapping("/")
public class HelloWorldRestController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello, World!";
    }

    Map<String, Customer> map = new HashMap<String, Customer>();

    @PostMapping("customer")
    public Customer save(@RequestBody Customer customer) {
        if (customer.getUuid() == null) {
            String uuid = UUID.randomUUID().toString();
            customer.setUuid(uuid);
            map.put(uuid, customer);
        } else {
            map.put(customer.getUuid(), customer);
        }
        return customer;
    }

    @GetMapping("customers")
    public List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            list.add(map.get(s));
        }
        return list;
    }

    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        Customer c = map.get(id);
        if (c == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        } else {
            return c;
        }
    }
}
