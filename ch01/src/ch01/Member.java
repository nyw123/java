package ch01;

public class Member {
    String sno;
    private String name;
    private int age;

    public Member(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    void getMemberInfo(int flag) {
        if (getAdmin(flag).equals("admin")) {
            System.out.println(sno + "," + name + "," + age);
        } else {
            System.out.println(sno + "," + name);
        }
    }

    private String getAdmin(int flag) {
        return flag == 1 ? "admin" : "member";
    }
}
