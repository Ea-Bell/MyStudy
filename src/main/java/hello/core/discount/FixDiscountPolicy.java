package hello.core.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import hello.core.member.Grade;
import hello.core.member.Member;

@Component
@Qualifier("fixDiscountPolicy")
public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int itemPrice) {
        // TODO Auto-generated method stub
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {

            return 0;
        }
    }
}
