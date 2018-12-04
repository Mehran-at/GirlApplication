public class GirlApplication {
    public static void main(String[] args) {
        PinkLipstick pinkLipstick = new PinkLipstick();
        RedLipstick redLipstick = new RedLipstick();
        Girl girl = new Girl(pinkLipstick);
        girl.wearMakeup();

    }
}
