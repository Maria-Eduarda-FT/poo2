interface MediaPlayer {
    void play(String filename);
}

interface VideoPlayer {
    void playVideo(String filename);
}

interface AudioPlayer {
    void playAudio(String filename);
}

class MP4Player implements VideoPlayer {
    @Override
    public void playVideo(String filename) {
        System.out.println("Reproduzindo vídeo MP4: " + filename);
    }
}

class MP3Player implements AudioPlayer {
    @Override
    public void playAudio(String filename) {
        System.out.println("Reproduzindo áudio MP3: " + filename);
    }
}

class VideoPlayerAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;
    
    public VideoPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
    
    @Override
    public void play(String filename) {
        videoPlayer.playVideo(filename);
    }
}

class AudioPlayerAdapter implements MediaPlayer {
    private AudioPlayer audioPlayer;
    
    public AudioPlayerAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    
    @Override
    public void play(String filename) {
        audioPlayer.playAudio(filename);
    }
}


public class Main{
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        MP4Player mp4Player = new MP4Player();
        
        MediaPlayer audioPlayerAdapter = new AudioPlayerAdapter(mp3Player);
        MediaPlayer videoPlayerAdapter = new VideoPlayerAdapter(mp4Player);
        
        System.out.println("=== Reproduzindo áudio ===");
        audioPlayerAdapter.play("musica.mp3");
        
        System.out.println("\n=== Reproduzindo vídeo ===");
        videoPlayerAdapter.play("filme.mp4");
    }
}