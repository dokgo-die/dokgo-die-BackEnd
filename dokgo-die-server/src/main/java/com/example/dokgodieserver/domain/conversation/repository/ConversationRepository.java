package com.example.dokgodieserver.domain.conversation.repository;

import com.example.dokgodieserver.domain.conversation.Conversation;
import com.example.dokgodieserver.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ConversationRepository extends CrudRepository<Conversation, Long> {
    Optional<Conversation> findByUser(User user);
}
