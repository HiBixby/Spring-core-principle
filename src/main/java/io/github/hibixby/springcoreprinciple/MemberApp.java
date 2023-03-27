package io.github.hibixby.springcoreprinciple;

import io.github.hibixby.springcoreprinciple.member.Grade;
import io.github.hibixby.springcoreprinciple.member.Member;
import io.github.hibixby.springcoreprinciple.member.MemberService;
import io.github.hibixby.springcoreprinciple.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
