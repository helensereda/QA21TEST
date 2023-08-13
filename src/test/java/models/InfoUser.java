package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoUser {

    private String firstName;
    private String lastName;
    private String code;

}