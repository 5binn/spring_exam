package com.example.qna3.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleService articleService;
    @GetMapping("/article/list")
    public String list(Model model) {
        List<Article> articleList = this.articleService.getArticle();
        model.addAttribute("articleList",articleList);
        return "article_list";
    }

    @GetMapping("/article/create")
    public String create() {
        return "article_create";
    }

    @PostMapping("/article/create")
    public String create(@RequestParam(value = "subject") String subject, @RequestParam(value = "content") String content) {
        articleService.create(subject, content);
        return "redirect:/article/list";
    }

    @GetMapping("/article/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Article article = this.articleService.findById(id);
        if (article != null) {
            model.addAttribute(article);
        }
        return "article_detail";
    }

}
