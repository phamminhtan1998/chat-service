package vn.com.phamtan.chatservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import vn.com.phamtan.chatservice.dto.base.BaseResp;
import vn.com.phamtan.chatservice.dto.group_chat.req.CreateGroupChatReq;
import vn.com.phamtan.chatservice.service.GroupChatService;

@RestController
@RequestMapping("v1.0/group-chat")
@RequiredArgsConstructor
public class GroupChatController {

    private final GroupChatService groupChatService;

    @GetMapping
    public ResponseEntity<BaseResp<Object>> getGroupChat(){
        return ResponseEntity.ok(new BaseResp<>(groupChatService.getGroupChat()));
    }

    @PostMapping
    public ResponseEntity<BaseResp<Object>> createGroupChat(@RequestBody CreateGroupChatReq req){
        return ResponseEntity.ok(new BaseResp<>(groupChatService.createGroupChat(req)));
    }


}
