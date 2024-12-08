package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressModel extends BaseModel{
    private String alias;
    private String lastName;
    private String firstName;
    private String country;
    private String state;
    private String city;
    private String address1;
    private String address2;
    private String postCode;
    private String phone;

    public AddressModel(String jsonFilePath) {
        super(jsonFilePath);
    }
}
