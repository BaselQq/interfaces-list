//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Playable playMusic = new MusicPlayer();
        Playable playVideo = new VideoPlayer();

        playMusic.play();
        playVideo.play();

        MediaController mediaController = new MediaController();
        mediaController.playMedia(playMusic);
        mediaController.playMedia(playVideo);
    }
}