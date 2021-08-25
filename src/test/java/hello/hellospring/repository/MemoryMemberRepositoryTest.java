package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.apache.ibatis.session.SqlSessionFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.util.Optional;

import static hello.hellospring.repository.MemoryMemberRepository.store;
import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @RunWith(SpringJUnit4ClassRunner.class)
    @SpringBootTest
    public class ConnectionTests {

        @Autowired
        private SqlSessionFactory sqlSessionFactory;

        @Test
        public void connection_test(){
            try(Connection con = sqlSessionFactory.openSession().getConnection()){
                System.out.println("커넥션 성공");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
