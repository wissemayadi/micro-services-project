package tn.wissem.msarticle.service;

import tn.wissem.msarticle.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleServiceInterface {
   Article createArticle(Article article);
   Article updateArticle(Map<Object, Object> fields, Long id);

   Article deleteArticle(Long id);

   Article getArticleById(Long id);

   List<Article> findAllArticles();
}
