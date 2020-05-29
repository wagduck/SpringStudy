package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    public String selectProducts(){
        return "hello DAO";
    }

    public Product selectProductById(int i){
         Product p = new Product(
                 i + "", "아이폰11", 500000, "iphone");
         return p;
//        return i + "번 상품입니다";
    }
}
