package com.goormthon.agoragoormthon.question.domain;

import com.goormthon.agoragoormthon.readingBook.domain.ReadingBook;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResponse {
    Long questionId;
    Long readingBookId;
    String content;

    public static QuestionResponse toDto(Question question, ReadingBook readingBook) {
        return QuestionResponse.builder()
                .questionId(question.getId())
                .readingBookId(readingBook.getId())
                .content(question.getContent())
                .build();
    }
}