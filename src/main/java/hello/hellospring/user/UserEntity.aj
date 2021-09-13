package hello.hellospring.user;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public aspect UserEntity {
    private int iuser;
    private String provider;
    private String email;
    private String pw;
    private String regdt;
}
