package com.example.dokgodieserver.domain.user.domain;

import com.example.dokgodieserver.domain.user.domain.type.Authority;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, unique = true)
    @NotNull
    private String accountId;

    @Column(length = 10)
    @NotNull
    private String name;

    @Column(length = 60)
    @NotNull
    private String password;

    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public User(String accountId, String name, String password) {
        this.accountId = accountId;
        this.name = name;
        this.password = password;
    }

}
