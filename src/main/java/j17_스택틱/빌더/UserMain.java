package j17_스택틱.빌더;

public class UserMain {
    public static void main(String[] args) {

        User user = User.builder()
                .email("ABC@hamil.com")
                .name("LED")
                .password("3241523")
                .username("JJ")
                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("JJ")
                .build();
        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);
    }
}
