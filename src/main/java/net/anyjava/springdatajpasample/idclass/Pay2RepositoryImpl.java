package net.anyjava.springdatajpasample.idclass;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Pay2RepositoryImpl extends QuerydslRepositorySupport implements Pay2RepositoryCustom {

    private static final QPay2 pay2 = QPay2.pay2;
    private static final QPayShop2 payShop2 = QPayShop2.payShop2;

    public Pay2RepositoryImpl() {
        super(Pay2.class);
    }

    @Override
    public List<Pay2> findAllByShopName(String shopName) {
        return from(pay2)
                .innerJoin(pay2.payShop2List, payShop2)
                .where(payShop2.shopName.contains(shopName))
                .fetch();
    }
}
