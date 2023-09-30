package com.example.quran.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sure")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sure {

    @Id
    @Column(name = "sure_id")
    private int sureId;

    @Column(name = "sure_ad")
    private String sureAd;

    @Column(name = "sure")
    private String sure;

    @Column(name = "ceviri")
    private String ceviri;

    @Column(name = "ayet_sayisi")
    private String ayetSayısı;
}
