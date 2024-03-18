//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String newline = System.lineSeparator();
        Playable playMusic = new MusicPlayer();
        Playable playVideo = new VideoPlayer();

        playMusic.play();
        System.out.println(newline);
        playVideo.play();
        System.out.println(newline);

        MediaController mediaController = new MediaController();
        mediaController.playMedia(playMusic);
        System.out.println(newline);
        mediaController.playMedia(playVideo);
    }
}