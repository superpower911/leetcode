import java.util.ArrayList;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/25 12:38
 */
public class Adapter{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("ZondAS");
        arrayList.add("Jack");
        arrayList.add("Nancy");

    }
}
class Device{
    //设备类
    public void playMp4(playerAdapter adapter){
        adapter.playMp4();
    }
}
interface PlayerAudio{
    //原始的play方法
    void play();
}
interface AdvancedPlayerAudio{
    //更先进的音乐播放器
    void playMp4();
}
class playerAdapter implements AdvancedPlayerAudio{
    private PlayerAudio playerAudio;//需要转换的原始mp3类
    public playerAdapter(PlayerAudio playerAudio){
        this.playerAudio = playerAudio;
    }

    @Override
    public void playMp4() {
        playerAudio.play();
        System.out.println("播放mp4视频");
    }
}

