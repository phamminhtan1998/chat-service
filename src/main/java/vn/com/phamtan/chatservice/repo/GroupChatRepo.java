package vn.com.phamtan.chatservice.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.com.phamtan.chatservice.domain.mongo.GroupChat;

@Repository
public interface GroupChatRepo extends MongoRepository<GroupChat, ObjectId> {

}
