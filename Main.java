public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("Turar", "Nurbauli")
                .age(19)
                .email("turarnurbauli@gmail.com")
                .phoneNumber("+7 771 156 82 64")
                .address("Astana, Kazakhstan")
                .build();
        User user2 = new User.Builder("Ayan", "Serik")
                .age(20)
                .email("ayan@example.com")
                .phoneNumber("+7 705 222 33 44")
                .address("Shymkent, Kazakhstan")
                .build();

        User user3 = new User.Builder("Dana", "Karimova")
                .age(19)
                .email("dana@example.com")
                .phoneNumber("+7 701 555 66 77")
                .address("Shymkent, Kazakhstan")
                .build();

        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);
    }
}
