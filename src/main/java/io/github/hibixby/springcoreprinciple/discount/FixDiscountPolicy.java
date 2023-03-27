package io.github.hibixby.springcoreprinciple.discount;

import io.github.hibixby.springcoreprinciple.member.Grade;
import io.github.hibixby.springcoreprinciple.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private final int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
