public abstract class Robot {
    private String unitName;

    public Robot() {
        this.unitName = "nameless Robot";
        boot();
    }

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
    }

    public void boot() {
        System.out.println("Robot " + unitName + " is starting up...");
    }

    public String getUnitName() {
        return unitName;
    }
    @Override
    public String toString() {
        return "Robot: " + unitName;
    }


    public abstract void bend(double v);

    public abstract void lift(double v);
}

