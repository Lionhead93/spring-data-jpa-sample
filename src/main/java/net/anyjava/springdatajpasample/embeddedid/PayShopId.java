package net.anyjava.springdatajpasample.embeddedid;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
@NoArgsConstructor
public class PayShopId implements Serializable {

    @EqualsAndHashCode.Include
    private PayDetailId payDetailId;

    @EqualsAndHashCode.Include
    @Column
    private Long shopNo;

    public PayShopId(PayDetailId payDetailId,
                     Long shopNo) {
        this.payDetailId = payDetailId;
        this.shopNo = shopNo;
    }
}
