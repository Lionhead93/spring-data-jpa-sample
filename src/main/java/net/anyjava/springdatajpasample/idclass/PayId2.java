package net.anyjava.springdatajpasample.idclass;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class PayId2 implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private Long payId;

    @EqualsAndHashCode.Include
    @Id
    private Long paySeq;

    public PayId2(Long payId,
                  Long paySeq) {
        this.payId = payId;
        this.paySeq = paySeq;
    }
}
