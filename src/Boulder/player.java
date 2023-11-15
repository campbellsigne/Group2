package Boulder;
import java.awt.image.BufferedImage;
public class player {
	private static BufferedImage[] walkingLeft = {Sprite.getSprite(0, 1, "74336.png"), Sprite.getSprite(1, 1,"74336.png"), Sprite.getSprite(2, 1,"74336.png")}; // Gets the upper left images of my sprite sheet
    private static BufferedImage[] walkingRight = {Sprite.getSprite(0, 3,"74336.png"), Sprite.getSprite(1, 3,"74336.png"), Sprite.getSprite(2, 3,"74336.png")};

    private static BufferedImage[] climbingUp = {Sprite.getSprite(0,2, "74336.png"), Sprite.getSprite(1,2, "74336.png"), Sprite.getSprite(2,2, "74336.png"), Sprite.getSprite(3,2, "74336.png")};
    private static BufferedImage[] climbingDown = {Sprite.getSprite(0,4, "74336.png"), Sprite.getSprite(1,4, "74336.png"), Sprite.getSprite(2,4, "74336.png"), Sprite.getSprite(3,4, "74336.png")};


    // These are animation states
    private static Animation walkLeft = new Animation(walkingLeft, 5);
    private static Animation walkRight = new Animation(walkingRight, 5);
    private static Animation climbUp = new Animation(climbingUp, 5);
    private static Animation climbDown = new Animation(climbingDown, 5);

    // This is the actual animation
    private static Animation animation = climbUp;

    public static Animation getAnimation() {
        return animation;
    }
}
