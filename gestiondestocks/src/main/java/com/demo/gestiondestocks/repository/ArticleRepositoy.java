package com.demo.gestiondestocks.repository;

import com.demo.gestiondestocks.dto.ArticleDto;
import com.demo.gestiondestocks.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ArticleRepositoy extends JpaRepository<Article,Integer> {
//Requete JPQL
    @Query("select codeArticle from Article where  codeArticle = :code")
    List<Article> findByCustomQuery();

    //Requtes native
    @Query(value="select  * from Article  where codeArticle = :code",nativeQuery = true)
    List<Article> findByCustomNativeQuery(@Param("code") String c);

    List<Article> findByIgnoreCasecodeArticle(String codeArticle, String desigantion);

   // @Query("select * from Article where  id = :id")
    Article findById();

    Optional<Article> findeArticleByCode(String codeArticle);

    // List<Article> findAll();

}
