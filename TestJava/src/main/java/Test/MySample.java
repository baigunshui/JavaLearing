package Test;

public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by:" + this.getClass().getClassLoader());

        new MyCat();
        System.out.println("From MySample: " + MyCat.class);
    }
}
