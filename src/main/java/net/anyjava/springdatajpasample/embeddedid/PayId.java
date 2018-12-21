package net.anyjava.springdatajpasample.embeddedid;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
@NoArgsConstructor
public class PayId implements Serializable {

    @EqualsAndHashCode.Include
    @Column
    private Long payId;

    @EqualsAndHashCode.Include
    @Column
    private Long paySeq;

    public PayId(Long payId,
                 Long paySeq) {
        this.payId = payId;
        this.paySeq = paySeq;
    }
}
