package com.goormthon.agoragoormthon.cloud.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cloud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_club", nullable = false)
    private Long bookClubId;

    @Column(name = "style", nullable = false )
    private int style;

}
