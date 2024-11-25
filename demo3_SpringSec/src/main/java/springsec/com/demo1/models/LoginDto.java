package springsec.com.demo1.models;

import lombok.Data;

@Data
public class LoginDto {
private String usernameOrEmail;
private String password;
}
