package com.example.dokgodieserver.domain.user.facade;

import com.example.dokgodieserver.domain.grade.repository.GradeRepository;
import com.example.dokgodieserver.domain.user.domain.User;
import com.example.dokgodieserver.domain.user.domain.repository.UserRepository;
import com.example.dokgodieserver.domain.user.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.example.dokgodieserver.domain.user.presentation.dto.response.MyPageResponse.*;

@RequiredArgsConstructor
@Component
public class UserFacade {

    private final UserRepository userRepository;
    private final GradeRepository gradeRepository;

    public User getCurrentUser() {
        String accountId = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByAccountId(accountId)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }

    public List<UserTalkResponse> getUserTalkList(User user) {

        return user.getConversationList()
                .stream()
                .map(conversation -> UserTalkResponse.builder()
                        .userId(conversation.getUser().getId())
                        .name(conversation.getUser().getName())
                        .grade(conversation.getUser().getResult())
                        .profileImageUrl(conversation.getUser().getProfileImageUrl())
                        .build())
                .toList();
    }

}
