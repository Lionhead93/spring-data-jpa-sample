package net.anyjava.springdatajpasample.embeddeid;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class PayDetailId implements Serializable {

    @EqualsAndHashCode.Include
    private PayId payId;

    @EqualsAndHashCode.Include
    @Column
    private Long payDetailId;
}
