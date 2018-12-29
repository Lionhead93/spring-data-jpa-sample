package net.anyjava.springdatajpasample.idclass;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "pay_shop_2")
@IdClass(PayShopId2.class)
@NoArgsConstructor
public class PayShop2 {

    @Id
    private Long payNumber;

    @Id
    private Long paySeq;

    @Id
    private Long payDetailId;

    @Id
    private String shopNo;

    private String shopName;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumns(value = {
            @JoinColumn(name = "payNumber", updatable = false, insertable = false),
            @JoinColumn(name = "paySeq", updatable = false, insertable = false),
            @JoinColumn(name = "payDetailId", updatable = false, insertable = false)
    }, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private PayDetail2 payDetail2;

    public PayShop2(Long payNumber,
                    Long paySeq,
                    Long payDetailId,
                    String shopNo,
                    String shopName) {
        this.payNumber = payNumber;
        this.paySeq = paySeq;
        this.payDetailId = payDetailId;
        this.shopNo = shopNo;
        this.shopName = shopName;
    }

    public void setPayDetail2(PayDetail2 payDetail2) {
        this.payDetail2 = payDetail2;
        this.payDetail2.addPayShop2(this);
    }
}
