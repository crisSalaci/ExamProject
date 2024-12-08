package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginModel extends BaseModel{
    private String email;
    private String password;

    public LoginModel(String jsonFilePath) {
        super(jsonFilePath);
    }
}
