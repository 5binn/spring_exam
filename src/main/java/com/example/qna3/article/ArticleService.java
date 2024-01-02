package com.example.qna3.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    public List<Article> getArticle() {
        return this.articleRepository.findAll();
    }
    public Article findById(int id) {
        Optional<Article> articleOptional = this.articleRepository.findById(id);
        if (articleOptional.isPresent()) {
            return articleOptional.get();
        }
        else return null;
    }
    public void create(String subject, String content) {
        Article article = new Article();
        article.setSubject(subject);
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());
        this.articleRepository.save(article);
    }

}
