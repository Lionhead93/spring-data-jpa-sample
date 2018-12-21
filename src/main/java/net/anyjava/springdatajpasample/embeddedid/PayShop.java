package net.anyjava.springdatajpasample.embeddedid;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor
public class PayShop {

    @EmbeddedId
    private PayShopId id;

    private String shopName;

    public PayShop(PayShopId id,
                   String shopName) {
        this.id = id;
        this.shopName = shopName;
    }
}
