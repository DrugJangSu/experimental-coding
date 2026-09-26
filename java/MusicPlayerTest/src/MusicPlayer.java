public class MusicPlayer {
    private final String songTitle;
    private int volume;

    public MusicPlayer(String songTitle, int volume) {
        this.songTitle = songTitle;
        setVolume(volume);

    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            System.out.println("⚠️ 경고: 볼륨은 0 미만일 수 없습니다! 음소거(0)로 설정합니다.");
            this.volume = 0; // 마이너스 볼륨 방어
        } else if (volume > 100) {
            System.out.println("⚠️ 경고: 볼륨은 100을 초과할 수 없습니다! 최대 볼륨(100)으로 제한합니다.");
            this.volume = 100; // 100 초과 방어
        } else {
            this.volume = volume;
        }
    }
    public void printPlayerInfo() {
            System.out.println("[재생 중 : " + songTitle + "] 현재 볼륨 : " + volume);
        }

}




