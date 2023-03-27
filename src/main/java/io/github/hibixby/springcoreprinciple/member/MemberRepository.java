package io.github.hibixby.springcoreprinciple.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
