package netology.hw_jdbc.service;

import lombok.AllArgsConstructor;
import netology.hw_jdbc.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository repository;

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
