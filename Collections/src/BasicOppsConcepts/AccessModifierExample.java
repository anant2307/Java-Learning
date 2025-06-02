package BasicOppsConcepts;

// Helper class to demonstrate access modifiers
class Sample {
    private String privateMessage = "Private: Only inside this class";
    String defaultMessage = "Default: Accessible within the same package";
    protected String protectedMessage = "Protected: Accessible within package and subclasses";
    public String publicMessage = "Public: Accessible everywhere";

    // Public method to access private variable
    public void showPrivateMessage() {
        System.out.println(privateMessage);
    }
}

// Main class
public class AccessModifierExample {
    public static void main(String[] args) {
        Sample obj = new Sample();

        // Accessing different members
        obj.showPrivateMessage(); // ✅ private variable via public method
        System.out.println(obj.defaultMessage);     // ✅ default
        System.out.println(obj.protectedMessage);   // ✅ protected
        System.out.println(obj.publicMessage);      // ✅ public
    }
}
