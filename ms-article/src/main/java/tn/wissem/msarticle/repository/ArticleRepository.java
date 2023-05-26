package tn.wissem.msarticle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.wissem.msarticle.entity.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>
{

}
