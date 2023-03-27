package io.github.hibixby.springcoreprinciple.discount;

import io.github.hibixby.springcoreprinciple.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
