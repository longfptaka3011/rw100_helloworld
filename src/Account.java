import java.time.LocalDate;

public class Account {

    int id;
    String username;
    String fullname;
    Gender gender;

    LocalDate createDate;
    int age;
    float height;
    float weight;
    float[] point;
    boolean isPass;

    // tạo enum;
    public enum Gender {
        MALE, FEMALE, UNKNOWN;
    }
}
