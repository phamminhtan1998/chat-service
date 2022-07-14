package vn.com.phamtan.chatservice.dto.group_chat.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.bson.types.ObjectId;
import vn.com.phamtan.chatservice.domain.mongo.GroupChat;
import vn.com.phamtan.chatservice.dto.base.BaseAllDto;

/**
 * Group chat response
 *
 * @since 13/07/2022
 * @author minhtan
 */
@Getter
@Setter
@ToString
@SuperBuilder
public class GroupChatResp extends BaseAllDto  {

    private String chatGroupId;
    private String name;
    private String displayName;
    @JsonProperty(value = "isActive")
    private Boolean isActive;
    private String ownerName;
    private String ownerId;

    public static GroupChatResp mapGroupChat2Resp(GroupChat groupChat){
        return  GroupChatResp.builder()
                .chatGroupId(groupChat.getChatGroupId().toHexString())
                .displayName(groupChat.getDisplayName())
                .name(groupChat.getName())
                .ownerId(groupChat.getOwnerId().toHexString())
                .ownerName(groupChat.getOwnerName())
                .isActive(groupChat.getIsActive())
                .createdDate(groupChat.getCreatedDate())
                .createdBy(groupChat.getCreatedBy())
                .updatedBy(groupChat.getUpdatedBy())
                .updatedDate(groupChat.getUpdatedDate())
                .build();
    }


}
