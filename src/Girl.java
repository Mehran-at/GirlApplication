public class Girl {
    private Lipstick redLipstick;

    public Girl(Lipstick lipstick) {
        this.redLipstick = lipstick;
    }

    public void wearMakeup() {
        System.out.println("I will try today lipstick color " +  redLipstick.getColor());
    }
}
