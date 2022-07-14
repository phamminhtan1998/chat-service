package vn.com.phamtan.chatservice.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Setter
@Getter
@SuperBuilder
public class BaseAllDto {
    @JsonProperty(index = 100)
    private String createdBy;
    @JsonProperty(index = 101)
    private LocalDate createdDate;
    @JsonProperty(index = 102)
    private String updatedBy;
    @JsonProperty(index = 103)
    private LocalDate updatedDate;



}
