package net.anyjava.springdatajpasample.embeddedid;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PayRepositoryImpl extends QuerydslRepositorySupport implements PayRepositoryCustom {

    private static final QPay pay = QPay.pay;
    private static final QPayShop payShop = QPayShop.payShop;

    public PayRepositoryImpl() {
        super(Pay.class);
    }

    @Override
    public List<Pay> findAllByShopName(String shopName) {
        return from(pay)
                .innerJoin(pay.payShops, payShop)
                .where(payShop.shopName.contains(shopName))
                .fetch();
    }
}
