package vn.com.phamtan.chatservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import vn.com.phamtan.chatservice.domain.mongo.GroupChat;
import vn.com.phamtan.chatservice.dto.group_chat.req.CreateGroupChatReq;
import vn.com.phamtan.chatservice.dto.group_chat.resp.GroupChatResp;
import vn.com.phamtan.chatservice.repo.GroupChatRepo;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class GroupChatService {

    private final GroupChatRepo groupChatRepo;
    public GroupChatResp getGroupChat(){
        log.info("Get group chat");
        List<GroupChat> groupChats = groupChatRepo.findAll();
        return GroupChatResp.mapGroupChat2Resp(groupChats.get(0));
    }

    public GroupChatResp createGroupChat(CreateGroupChatReq req){

        GroupChat groupChat = GroupChat.builder()
                .chatGroupId(new ObjectId())
                .name(req.getName())
                .displayName(req.getDisplayName())
                .isActive(req.getIsActive())
                .ownerId(new ObjectId(req.getOwnerId()))
                .ownerName(req.getOwnerName())
                .build();

        GroupChat group = groupChatRepo.save(groupChat);
        return GroupChatResp.mapGroupChat2Resp(group);

    }
}
