package ch01;

public class MemberExam {
    public static void main(String[] args) {
        Member member = new Member("1", "홍길동", 18);
        System.out.println(member.sno);
        member.getMemberInfo(1);
        member.getMemberInfo(2);
        member.getAdmin(1);
    }
}
