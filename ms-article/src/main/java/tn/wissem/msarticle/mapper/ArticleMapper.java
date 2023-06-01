package tn.wissem.msarticle.mapper;

import dto.articleDto;
import dto.stockDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import tn.wissem.msarticle.entity.Article;

@RequiredArgsConstructor
@Getter
@Setter
@Service
public class ArticleMapper {


    public  articleDto articleToArticleDto(Article article, stockDto stockDto){
        articleDto articleDto = new articleDto();
       articleDto.setName(article.getName());
         articleDto.setQtite(article.getQtite());
        articleDto.setStockDto(stockDto);
        return articleDto;
    }

    public  Article articleDtoToArticle(articleDto articleDto){
        Article article = new Article();
        article.setName(articleDto.getName());
        article.setQtite(articleDto.getQtite());
        return article;
    }
}
