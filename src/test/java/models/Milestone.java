package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
@Data
@Builder
public class Milestone {
    @SerializedName(value = "name")
    private String milestoneName;
    @SerializedName(value = "description")
    private String milestoneDescription;

}