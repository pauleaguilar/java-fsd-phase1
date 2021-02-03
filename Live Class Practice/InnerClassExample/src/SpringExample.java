
public class SpringExample {

    private String myName = "Paul";


    public void TestString() {
        System.out.println(myName);
        System.out.println(myName = "othy");

        StringBuffer buffer = new StringBuffer(myName);
        StringBuilder builder = new StringBuilder(myName);

        buffer.append("othy");
        builder.append("othy");

        System.out.println(buffer.toString());

        System.out.println(builder.toString());

    }
}
