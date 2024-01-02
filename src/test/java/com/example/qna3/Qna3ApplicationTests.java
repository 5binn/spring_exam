package com.example.qna3;

import com.example.qna3.article.Article;
import com.example.qna3.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Qna3ApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;
	@Test
	void contextLoads() {
		Article article = new Article();
		article.setContent("제목입니다");
		article.setSubject("내용입니다");
		article.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article);
	}

}
