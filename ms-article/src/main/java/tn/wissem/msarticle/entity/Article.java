package tn.wissem.msarticle.entity;

import lombok.*;
import org.example.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Article extends BaseEntity
{
    private String name;
    private int qtite;
    private long stockId;
}
