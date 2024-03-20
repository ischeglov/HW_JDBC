package netology.hw_jdbc.controller;

import netology.hw_jdbc.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService service;

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam (value = "name",required = false) String name) {
        return service.getProductName(name);
    }
}
