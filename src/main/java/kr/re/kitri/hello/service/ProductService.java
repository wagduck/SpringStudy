package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ProductDao;
import kr.re.kitri.hello.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ProductService {

    String retrieveProducts();
    Product viewProductDetail(int i) ;
}
