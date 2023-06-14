public class CrazyRobot extends Robot {
    public CrazyRobot() {
        super();
    }
// construct
    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot() {
        System.out.println("Initializing craziness...");
        String reversedName = reverseName(getUnitName());
        String twistedName = twistName(reversedName);
        System.out.println("New name: " + twistedName);
    }

    @Override
    public void bend(double v) {

    }

    @Override
    public void lift(double v) {

    }

    private String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    private String twistName(String name) {
        StringBuilder twisted = new StringBuilder();
        for (char c : name.toCharArray()) {
            if (Character.isUpperCase(c)) {
                twisted.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                twisted.append(Character.toUpperCase(c));
            } else {
                twisted.append(c);
            }
        }
        return twisted.toString();
    } }

