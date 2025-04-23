package com.hun.project_board.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title; // 제목
    private String content; // 본문
    private String hashtag; // 해시태그

    private LocalDate createAt; // 생성일시
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
