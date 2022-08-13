import com.google.gson.internal.bind.util.ISO8601Utils;

public class RegistrationTest {
    public static void main(String[] args) {
        Registration r1= new Registration("spoorthi","prakash","spurti20oct@gmail.com");
        System.out.println(r1.getFirstname());
        System.out.println(r1.getLastname());
        System.out.println(r1.getEmail());
        r1.setEmail("abs.dfr");
        System.out.println(r1.getEmail());



    }

}
