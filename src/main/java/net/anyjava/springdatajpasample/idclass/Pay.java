package net.anyjava.springdatajpasample.idclass;

import net.anyjava.springdatajpasample.embeddeid.PayId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@IdClass(PayId.class)
@Entity
public class Pay {

    @Id
    private Long payId;

    @Id
    private Long paySeq;
}
