package hello.core.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import hello.core.annotation.MainDiscountPoilcy;
import hello.core.member.Grade;
import hello.core.member.Member;

@Component
@MainDiscountPoilcy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int itemPrice) {
        // TODO Auto-generated method stub
        if (member.getGrade() == Grade.VIP) {
            return itemPrice * discountPercent / 100;
        }
        return 0;
    }
}
