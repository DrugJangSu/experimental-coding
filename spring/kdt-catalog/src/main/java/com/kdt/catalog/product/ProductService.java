package com.kdt.catalog.product;

import com.kdt.catalog.common.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // "비즈니스 로직을 담당하는 클래스" + 스프링이 객체를 만들어 관리한다
public class ProductService {
    private final ProductRepository productRepository; // DB 접근은 Repository에게 맡긴다

    // 생성자 주입: 스프링이 ProductRepository 구현체를 알아서 넣어준다
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll(); // SELECT * FROM catalog_product
    }

    public long count() {
        return productRepository.count(); // SELECT COUNT(*)
    }

    public Product findById(Long id) {
        // findById는 Optional(있을 수도, 없을 수도)을 돌려준다
        // 없으면 NotFoundException을 던진다 -> ApiExceptionAdvice가 404 응답으로 바꿔준다
        return productRepository.findById(id).orElseThrow(() -> new NotFoundException("product missing"));
    }

    public Product create(ProductCreateRequest request) {
        Product product = new Product(request.name(), request.price(), request.stock());
        return productRepository.save(product);
    }

    public void delete(Long id) {
        Product product = findById(id);
        productRepository.delete(product);
    }

    @Transactional
    public Product update(Long id, ProductUpdateRequest request) {
        Product product = findById(id);
        product.update(request.name(), request.price(), request.stock());
        return product;
    }
}
