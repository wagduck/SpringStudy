package kr.re.kitri.hello.exception;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLInvalidAuthorizationSpecException;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = SQLInvalidAuthorizationSpecException.class)
    public String handleSqlInvalidException(){
        return "-----Duck's debug : DB Connection ERROR---------";
    }

    @ExceptionHandler(value = MyBatisSystemException.class)
    public String handleMyBatis(){
        return "-----Duck's debug : MyBatisSystem-----";
    }

    @ExceptionHandler(value = TooManyResultsException.class)
    public String handleTooManyResult(){
        return "-----Duck's debug : Too Many Result-------";
    }

    @ExceptionHandler(value = SQLException.class)
    public String handleSql(){
        return "---- Duck's debug : SQL ERROR-------";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleAll(Exception se){
        return "---- Duck's debug : All other errors....------" + se;
    }





}
