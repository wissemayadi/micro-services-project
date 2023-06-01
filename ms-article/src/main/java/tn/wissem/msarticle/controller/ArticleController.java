package tn.wissem.msarticle.controller;

import dto.articleDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.wissem.msarticle.entity.Article;
import tn.wissem.msarticle.repository.ArticleRepository;
import tn.wissem.msarticle.service.ArticleService;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/article")
public class ArticleController {
   private final ArticleService articleService;
   @PatchMapping("/{id}")
   Article updateArticle(
                         @RequestBody  Map<Object,Object> fields,
                         @PathVariable Long id)
   {
        return articleService.updateArticle(fields,id);
   }

   @PostMapping("/add")
   Article createArticle(@RequestBody Article article)
   {
       return articleService.createArticle(article);
   }

   @GetMapping("/all")
    public List<Article> getAllArticles() {
         return articleService.findAllArticles();
    }

    @GetMapping("/{id}")
    public articleDto getArticleById(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }

}
