package hello.hellospring.security;

import hello.hellospring.user.UserEntity;
import hello.hellospring.user.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {
    @Autowired UserMapper mapper;
    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return null;
    }
    public UserEntity loadUserByUsernameAndProvider(String id, String provider){
        UserEntity param = new UserEntity();
        param.setProvider(provider);
        param.setEmail(id);
        return mapper.selUser(param);
    }
}
