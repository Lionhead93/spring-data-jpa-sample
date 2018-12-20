package net.anyjava.springdatajpasample.embeddeid;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Pay {

    @EmbeddedId
    private PayId id;
}
