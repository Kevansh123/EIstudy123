public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        // Play mp4 using adapter
        audioPlayer.play("mp4", "movie.mp4");
    }
}
