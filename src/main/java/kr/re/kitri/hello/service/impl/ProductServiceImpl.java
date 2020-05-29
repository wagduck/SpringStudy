package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.ProductDao;
import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public String retrieveProducts(){
        return productDao.selectProducts();
//          return "hello service";

    }

    public Product viewProductDetail(int i) {

        return productDao.selectProductById(i);
    }
}
