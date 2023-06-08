
interface Video {
    public void play();
    public void stop();
}


class RealVideo implements Video {
    private String title;

    public RealVideo(String title) {
        this.title = title;
        loadVideoFromDisk();
    }

    private void loadVideoFromDisk() {
        System.out.println("Loading " + title + " from disk.");
    }

    public void play() {
        System.out.println("Playing " + title);
    }

    public void stop() {
        System.out.println("Stopping " + title);
    }
}


class VideoProxy implements Video {
    private RealVideo video;
    private String title;

    public VideoProxy(String title) {
        this.title = title;
    }

    public void play() {
        if (video == null) {
            video = new RealVideo(title);
        }
        video.play();
    }

    public void stop() {
        if (video != null) {
            video.stop();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Video video = new VideoProxy("The Lord of the Rings");
        video.play();
        video.play();
        video.stop();
    }
}
