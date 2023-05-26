package tn.wissem.msarticle.service;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;
import tn.wissem.msarticle.entity.Article;
import tn.wissem.msarticle.repository.ArticleRepository;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ArticleService implements  ArticleServiceInterface{
    private final  ArticleRepository articleRepository;
    @Override
    public Article createArticle(Article article) {
        article.setCreatedAt(LocalDate.now());
        return articleRepository.save(article);
    }


    @Override
    public Article updateArticle(Map<Object, Object> fields, Long id) {
        Optional <Article> article = articleRepository.findById(id);
        Assert.isTrue(article.isPresent(),"Article not found with this id");
        fields.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Article.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,article.get(),value);
        });
        return articleRepository.save(article.get());

    }

    @Override
    public Article deleteArticle(Long id) {
   return null;
    }

    @Override
    public Article getArticleById(Long id) {
        Optional <Article> article = articleRepository.findById(id);
        Assert.isTrue(article.isPresent(),"Article not found with this id");
        return article.get();
    }

    @Override
    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

}
