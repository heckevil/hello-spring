package hello.hellospring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    UserMapper mapper;

    public UserVo selUser(){
        return mapper.selUser();
    }
}
