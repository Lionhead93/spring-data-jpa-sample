package net.anyjava.springdatajpasample.embeddeid;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PayDetail {

    @EmbeddedId
    private PayDetailId id;
}
