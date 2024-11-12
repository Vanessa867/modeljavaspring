package com.comliv.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClubsModel {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "nome_club", nullable = false, length = 255)
    private String clubName;
    @Column(name = "descrição", nullable = false, length = 255)
    private String description;
    @Column(name = "data_inicio", nullable = false)
    private String startDate;
    @Column(name = "data_final", nullable = false)
    private String endDate;
    @ManyToMany
    @JoinColumn(name= "id_categoria")
    private CategoryModel categoryModel;
}
