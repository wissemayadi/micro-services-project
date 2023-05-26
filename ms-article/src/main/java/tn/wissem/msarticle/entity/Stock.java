package tn.wissem.msarticle.entity;

import lombok.*;
import org.example.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Stock extends BaseEntity {

    private String name;
    private int qtite;

}
