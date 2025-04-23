package com.hun.project_board.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArticleComment {
    private long id;
    private Article article; // 게시글 (ID)
    private String content; // 본문

    private LocalDate createAt; // 생성일시
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정
}
