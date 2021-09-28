package ex02;

abstract class PlayerLevel {

    protected abstract void showLevelMessage();
    protected abstract void run();
    protected abstract void jump();
    protected abstract void turn();

    final void go(int count){ //template method
        showLevelMessage();
        run();
        while (count-- != 0) {
            jump();
        }
        turn();
    }
}
