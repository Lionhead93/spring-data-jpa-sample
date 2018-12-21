package net.anyjava.springdatajpasample.idclass;

import lombok.NoArgsConstructor;
import net.anyjava.springdatajpasample.embeddedid.PayId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@IdClass(PayId.class)
@Entity
@Table(name = "pay_2")
@NoArgsConstructor
public class Pay2 {

    @Id
    private Long payId;

    @Id
    private Long paySeq;
}
