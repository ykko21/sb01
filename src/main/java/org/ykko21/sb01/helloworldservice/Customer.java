package org.ykko21.sb01.helloworldservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("zipcode")
    private String zipCode;
}
