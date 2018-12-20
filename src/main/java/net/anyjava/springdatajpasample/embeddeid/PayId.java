package net.anyjava.springdatajpasample.embeddeid;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class PayId implements Serializable {

    @EqualsAndHashCode.Include
    @Column
    private Long payId;

    @EqualsAndHashCode.Include
    @Column
    private Long paySeq;
}
