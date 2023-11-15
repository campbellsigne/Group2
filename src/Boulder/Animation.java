package Boulder;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Animation {
	 private final int frameDelay;                 // frame delay 1-12 (You will have to play around with this)
	    private final int animationDirection;         // animation direction (i.e counting forward or backward)
	    private final int totalFrames;                // total amount of frames for your animation
	    private final List<Boulder.Frame> frames = new ArrayList<Boulder.Frame>();    // Arraylist of frames
	    private int frameCount;                 // Counts ticks for change
	    private int currentFrame;               // animations current frame
	    private boolean stopped;                // has animations stopped

	    public Animation(BufferedImage[] frames, int frameDelay) {
	        this.frameDelay = frameDelay;
	        this.stopped = true;

	        for (int i = 0; i < frames.length; i++) {
	            addFrame(frames[i], frameDelay);
	        }

	        this.frameCount = 0;
	        this.currentFrame = 0;
	        this.animationDirection = 1;
	        this.totalFrames = this.frames.size();
	    }

	    public void start() {
	        if (!stopped) {
	            return;
	        }
	        if (frames.size() == 0) {
	            return;
	        }
	        stopped = false;
	    }

	    public void stop() {
	        if (frames.size() == 0) {
	            return;
	        }
	        stopped = true;
	    }

	    public void restart() {
	        if (frames.size() == 0) {
	            return;
	        }
	        stopped = false;
	        currentFrame = 0;
	    }

	    public void reset() {
	        this.stopped = true;
	        this.frameCount = 0;
	        this.currentFrame = 0;
	    }

	    private void addFrame(BufferedImage frame, int duration) {
	        if (duration <= 0) {
	            System.err.println("Invalid duration: " + duration);
	            throw new RuntimeException("Invalid duration: " + duration);
	        }
	        frames.add(new Boulder.Frame(frame, duration));
	        currentFrame = 0;
	    }

	    public BufferedImage getSprite() {
	        System.out.println("current frame :" + currentFrame);
	        return frames.get(currentFrame).getFrame();
	    }

	    public void update() {
	        if (stopped) {
	            frameCount +=3;
	            if (frameCount > frameDelay) {
	                frameCount = 0;
	                currentFrame += animationDirection;
	                if (currentFrame > totalFrames - 1) {
	                    currentFrame = 0;
	                } else if (currentFrame < 0) {
	                    currentFrame = totalFrames - 1;
	                }
	            }
	        }
	    }
}
