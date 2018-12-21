package net.anyjava.springdatajpasample.embeddedid;

import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pay_1")
@NoArgsConstructor
public class Pay {

    @EmbeddedId
    private PayId id;
}
