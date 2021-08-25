package hello.hellospring.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVo selUser();
}
