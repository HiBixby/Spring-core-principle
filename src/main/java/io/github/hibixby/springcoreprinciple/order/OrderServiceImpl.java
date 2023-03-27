package io.github.hibixby.springcoreprinciple.order;

import io.github.hibixby.springcoreprinciple.discount.DiscountPolicy;
import io.github.hibixby.springcoreprinciple.discount.FixDiscountPolicy;
import io.github.hibixby.springcoreprinciple.member.Member;
import io.github.hibixby.springcoreprinciple.member.MemberRepository;
import io.github.hibixby.springcoreprinciple.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
