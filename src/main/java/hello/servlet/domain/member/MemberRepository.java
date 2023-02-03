package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    // 싱글톤으로 관리
    private static final MemberRepository instance = new MemberRepository();

    // 싱글톤으로 관리하니까 아무나 생성하지 못하도록 private 생성자 만들기
    private MemberRepository() {
    }

    // getInstance() 메서드로만 조회 가능!
    public static MemberRepository getInstance() {
        return instance;
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values()); //store에 있는 밸류 리스트는 건들지 않도록 새로운 리스트를 생성해 리턴
    }


    // 테스트용
    public void cleatStore() {
        store.clear();
    }
}
