package vn.com.phamtan.chatservice.dto.group_chat.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateGroupChatReq {

    private String name;

    private String displayName;

    private Boolean isActive;

    private String ownerName;

    private String ownerId;

}
