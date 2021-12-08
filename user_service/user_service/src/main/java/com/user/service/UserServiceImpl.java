package com.user.service;
import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements Userservice{

    List<User> list = List.of(
            new User(1311L,"Kiran Kittur","9422402355"),
            new User(1312L,"Kunal Kittur","9022134192"),
            new User(1313L,"Pravin Patange","9881371054")
    );
    @Override
    public User getUser(Long id) {

        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
