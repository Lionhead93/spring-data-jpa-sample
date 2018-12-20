package net.anyjava.springdatajpasample.embeddeid;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PayShop {

    @EmbeddedId
    private PayShopId id;
}
