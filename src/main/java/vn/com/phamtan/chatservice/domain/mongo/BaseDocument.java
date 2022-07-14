package vn.com.phamtan.chatservice.domain.mongo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Getter
@Setter
public class BaseDocument {
    @Field("created_by")
    @CreatedBy
    private String createdBy;

    @Field("created_date")
    @CreatedDate
    private LocalDate createdDate;

    @Field("updated_by")
    @LastModifiedBy
    private String updatedBy;

    @Field("updated_date")
    @LastModifiedDate
    private LocalDate updatedDate;

    @Version
    private Long version;
}
