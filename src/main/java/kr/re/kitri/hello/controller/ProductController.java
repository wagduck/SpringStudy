package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping ("/products")
    public String getProducts(){
        return productService.retrieveProducts();
//        return "hello";
    }

    @GetMapping("/products/{productId}")
    public Map<String, Object> getProductDetailsByProductId(
            @PathVariable int productId){
        System.out.println(productId);
        Product p = productService.viewProductDetail(productId);
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");
        result.put("data", p);
        return result;

    }

}
