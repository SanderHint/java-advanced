package homeworks;

public class Cat extends Animal {

    public Cat(boolean tail, boolean canSeeInDark) {
        this.tail = tail;
        this.canSeeInDark = canSeeInDark;
    }

    boolean tail;
    boolean canSeeInDark;

    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean getCanSeeInDark() {
        return canSeeInDark;
    }

    public void setCanSeeInDark(boolean canSeeInDark) {
        this.canSeeInDark = canSeeInDark;
    }


    @Override
    public void yieldVoice() {
        System.out.println("Cat says " + "Meow!");
    }
}