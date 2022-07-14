package vn.com.phamtan.chatservice.domain.mongo;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("group_chat")
@Data
@Builder
public class GroupChat extends BaseDocument {
    @Id
    private ObjectId chatGroupId;

    private String name;

    @Field("display_name")
    private String displayName;

    @Field("is_active")
    private Boolean isActive;

    @Field("owner_name")
    private String ownerName;

    @Field("owner_id")
    private ObjectId ownerId;



}
