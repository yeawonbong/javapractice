package ex02;

public class Player {
    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
    }
    public PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel uplevel){
        this.level = uplevel;
    }
    public void play(int count){
        level.go(count);
    }

}
