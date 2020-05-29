package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
@Repository
public class UserDao {
    public User insertUser(User user) {
        System.out.println("insert OK........" + user);
        return user;
    }
}
*/

@Repository
@Mapper
public interface UserDao {
    void insertUser(User user);

    List<User> selectAllUsers();

    User selectUserByUserId(String userId);
}
