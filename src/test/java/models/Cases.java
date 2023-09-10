package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString

public class Cases {
    @SerializedName(value = "section_id")
    private int sectionId;
    @SerializedName(value = "title")
    private String titleCase;
    @SerializedName(value = "template_id")
    private int templateId;
    @SerializedName(value = "type_id")
    private int typeId;
    @SerializedName(value = "priority_id")
    private int priorityId;
    @EqualsAndHashCode.Exclude
    private int id;

}