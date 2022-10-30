package homeworks;

public class Dog extends Animal{

    public Dog(boolean tail, boolean loyal) {
        this.tail = tail;
        this.loyal = loyal;
    }

    boolean tail;

    boolean loyal;

    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean getLoyal() {
        return loyal;
    }

    public void setLoyal(boolean loyal) {
        this.loyal = loyal;
    }

    @Override
    public void yieldVoice() {
        System.out.println("Dog says " + "Woof!");
    }
}
