//declaring the package the program exists in
package application;

/* Welcome to PONG! This is our final group project for the ICS4U course, 
 * we decided to do this project beacsue we wanted to give our own spin on this
 * classic arcade game. Pong follows the rules of tradional table tennis, with a 
 * virtual twist. "The player controls an in-game paddle by moving it vertically 
 * across the left or right side of the screen. They can compete against another player 
 * controlling a second paddle on the opposing side. Players use the paddles to 
 * hit a ball back and forth." In our case, the opposing player is an AI, as implementing
 * a second player would have beeen very difficult logistically, and would have made
 * the game require a second player to play, which would have been impractical.
 */

//WHO DID WHAT?

/* OMAR: COMMENTS, LOGIC, PHYSICS, DECISION STRUCTURES, DEBUGGING
 * 
 * LIAM + YALINA: COMMENTS, MOVEMENT/AI of user player and computer player
 * ANIMATION and getting everything to sync properly 
 * 
 * HUNTER: GUI, and making everything show up on the screen
 */

//importing all of the different packages which are required for the project
//importing the random utilitiy, so we can generate random choices
import java.util.Random;

//unfortunatley, in javafx, you cant use import javafx.*, so we have to manually import everything we need
//importing the packages for animation and timeline
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

//importing the pacakge for the application extension, this connects us to the main javafx package
import javafx.application.Application;

//importing the packages for the actual screen. In JavaFx, the screen is composed of 4 parts, 
///the scene, canvas, stage, and graphicscontext, so we import all of those
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//importing all of the packages for color, font, and text size. General visual appeal packages
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

//the main class, where all the magic happens ;)
public class Main extends Application {

	// constants to store the dimensions of the display/objects
	// declaring variables for height and width of the Game background
	// these are constants beacuse they will not be changed after the inital
	// declaration
	private static final int intWidth = 800;
	private static final int intHeight = 600;

	// declaring constants for the player's rectangular paddle
	// these are constants beacuse they will not be changed after the inital
	// declaration
	private static final int PLAYER_HEIGHT = 100;
	private static final int PLAYER_WIDTH = 15;

	// constant for radius of the ball
	// this is a constant beacuse it will not be changed after the inital
	// declaration
	private static final double BALL_SIZE = 15;

	// declaring a variable for the targetscore
	private int intTarget = 5;

	// declaring the ball x and y speeds as 1, which means it starts at a pretty
	// slow speed
	private int intBallYSpeed = 1;
	private int intBallXSpeed = 1;

	// declaring player positions
	private double dblPlayerOneYPos = intHeight / 2;
	private double dblPlayerTwoYPos = intHeight / 2;

	// put player paddle to left size
	private int intPlayerOneXPos = 0;

	// placing player 2 relative to the size of the background to line it up against
	// the edge
	private int intPlayerTwoXPos = intWidth - PLAYER_WIDTH;

	// reset the positon of the ball, by assigning its width to half of the screen,
	// which means that is its halfway down the middle. do the same for the height
	// of the screen, so that now it is set in the middle both vertically and
	// horizontally, which is the perfect middle
	private double dblBallXPos = intWidth / 2;
	private double dblBallYPos = intHeight / 2;

	// declaring variables for both the player scores, starting them both off at 0
	private int intScoreP1 = 0;
	private int intScoreP2 = 0;

	// declaring a boolean for the gamestarted, which allows us to toggle the game
	// on or off
	private boolean bolGameStarted;
	
	// the method for starting the game, one of the integral parts of any javafx
	// program, it allows us to set all of the start code for the program
	public void start(Stage stage) throws Exception {

		// setting the title of the newly opened JavaFx window to "PONG", the name of
		// the game
		stage.setTitle("PONG - ICS4U");

		// here, we first declare a new canvas, which is the editable screen, by passing
		// in the parameters
		// for the width and height, using the new Canvas keyword

		Canvas canvas = new Canvas(intWidth, intHeight);
		// in JavaFx, the graphicscontext, is the screen which can have elements added
		// or removed to and from it
		// what must be done, is th assign a graphics type to a canvas, which we do by
		// assigning the canvas declared above
		// as a 2d context, which means it will have 2d graphics, which is what is used
		// in the pong game
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// JavaFX Timeline = free form animation defined by KeyFrames and their duration
		Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc)));

		// number of cycles in animation INDEFINITE = repeat indefinitely
		tl.setCycleCount(Timeline.INDEFINITE);

		// mouse control (move and click)
		// sets players one's y pos to the mouse's y position when it moves
		// e represents the event when the mouse is moved and getY() will return its
		// ypos
		canvas.setOnMouseMoved(e -> dblPlayerOneYPos = e.getY());

		// sets the boolean for game started to true when the mouse is clicked
		canvas.setOnMouseClicked(e -> bolGameStarted = true);

		// here, we set the stage, which is the screen, by assigning the scene as being
		// the canvas, in the form of a stackpane. By assigning it as a stackpane, that
		// means that each new element is stacked ontop of one another.
		stage.setScene(new Scene(new StackPane(canvas)));

		// show the stage, which means that we now display in to the screen, which means
		// the user can now see it
		stage.show();

		// by calling timeline.play, this means that we are loading all of the
		// animations which we have made below, and playing them on the animation
		// timeline. For example, the ball animation would count as part of the
		// timeline, which we now tell to run.
		tl.play();

	}

	// the method for the running of the program, this what is called when the
	// program is run, again, this is one of the methods which must exist in every
	// javafx project
	private void run(GraphicsContext gc) {

		// here, we set the fill color of the background as 1st COLOR, and then fill a
		// rectange into half the screen, with positon 0 0, and the height being the
		// constant declared above, and then the width being half of the overall size,
		// so that we color only half the screen
		gc.setFill(Color.rgb(255, 128, 128));
		gc.fillRect(0, 0, intWidth / 2, intHeight);

		// here, we set the fill color of the background as 2nd COLOR, and then fill a
		// rectange into half the screen, with positon 400 0, and the height being the
		// constant declared above, and then the width being half of the overall size,
		// so that we color only half the screen. By going 400 for the x, we paint
		// from the halfway of the screen.
		gc.setFill(Color.rgb(128, 128, 255));
		gc.fillRect(intWidth / 2, 0, intWidth / 2, intHeight);

		// here, we change the fill color to our chosen COLOR, so that the paddles,
		// ball, and any new elements or text we enter are that same color, and then
		// assin the font size to 25, so that any new text is at font size 25
		gc.setFill(Color.rgb(248, 237, 250));
		gc.setFont(Font.font(25));;

		// set the alignment of the text to center, so that any text we enter is center
		// aligned
		gc.setTextAlign(TextAlignment.CENTER);

		// if the game has been started,
		if (bolGameStarted) {

			if (intScoreP1 == intTarget || intScoreP2 == intTarget) {

				// This is the scoreboard for both the user and the computer. It will show who
				// is winning and losing the game.
				intScoreP1 = 0;
				intScoreP2 = 0;

			}

			// here, what we do, is that on run, we move the ball, by slowly changning both
			// its x and y positons by 1, which means that it shifts over by 1 on the
			// screen, simulating motion. By doing this to both the x and y positons, we
			// move the ball in both directions
			dblBallXPos += intBallXSpeed;
			dblBallYPos += intBallYSpeed;

			// these next few lines of the code are checking for, and doing the player 2, or
			// computer movement

			// here, we are pretty much checking if the positon of the ball is near the
			// middle, meaning that we are checking if the xpositon is less than 75% of the
			// screen in either direction, which means that it is within 25% in either
			// direction from the middle. If so, that means that the computer paddle has to
			// track the ball near the middle, so do as such
			if (dblBallXPos < intWidth - intWidth / 4) {

				// move the second player, the computer, two the positon of the ball, - half of
				// the height of the paddle
				// this means that is pretty much centers it in relation to the the ball, to
				// make it easier to move up or down the paddle to hit the ball
				dblPlayerTwoYPos = dblBallYPos - PLAYER_HEIGHT / 2;

				// otherwise, if the ball is not moving near the middle, that means we have to
				// move directly up or down
			} else {

				// if the ypos of the ball is greater than the ypositon of the second player +
				// half of the constant of the player paddle size
				if (dblBallYPos > dblPlayerTwoYPos + PLAYER_HEIGHT / 2) {

					// move the ypos of the player two down by 5, after much testing, this was the
					// perfect amount to make the game a good difficulty, this number can be lowered
					// to make the game easier, or increased to make the game harder
					dblPlayerTwoYPos += 5;

					// otherwise, if the ypositon of the ball lower than the paddle, we move the
					// player 2
					// positon down, to try and catch up with the ball
				} else {

					// move the ypos of the player two up by 5, after much testing, this was the
					// perfect amount to make the game a good difficulty, this number can be lowered
					// to make the game easier, or increased to make the game harder
					dblPlayerTwoYPos -= 5;

				}

			}

			// This line keeps on re-drawing the ball, by filling in a ball using the
			// current x and y positons of the ball, and then the radius as both the width
			// and the height
			gc.fillOval(dblBallXPos, dblBallYPos, BALL_SIZE, BALL_SIZE);

			// otherwise, if the game is not currently running, run through the menu, and
			// all other related procedures
		} else {

			// if the score of both players is 0, that means that the game just started, so
			// display the start message, and ask them to click to start the game
			if (intScoreP1 == 0 && intScoreP2 == 0) {

				// add text to the screen, which assigns the message welcom to pong to the
				// screen, and tells them what to press to start or exit the game
				// this is centered at half the height, and half the width of the screen, which
				// is the same as halfway in each directon, or the perfect middle
				gc.fillText("Welcome to PONG! \n\nYou are the left paddle; move your mouse cursor\nup and down to control your paddle."
						+ "\nYou get a point by hitting the ball beyond the other paddle.\nFirst player to 5 points wins! \nClick 'x' at the top of the window to exit.\n"
						+ "\nClick to start the game!", intWidth / 2, intHeight / 4);
				
				// if the score of the first player is at the target score, that means the first
				// player won, so display a win messsage
			} else if (intScoreP1 == intTarget) {

				// add text to the screen, which tells the human player that they won
				// this is centered at half the height, and half the width of the screen, which
				// is the same as halfway in each directon, or the perfect middle
				gc.fillText("You Win! \nClick to play again! \nClick 'x' at the top of the window to exit.", intWidth / 2, intHeight / 2);

				// if the score of the second, computer player is at the target score, that
				// means the first
				// player lost, so display a lose messsage
			} else if (intScoreP2 == intTarget) {

				// add text to the screen, which tells the human player that they lost
				// this is centered at half the height, and half the width of the screen, which
				// is the same as halfway in each directon, or the perfect middle
				gc.fillText("You Lose! \nClick to play again! \nClick 'x' at the top of the window to exit.", intWidth / 2, intHeight / 2);

				// otherwise, if there are no special conditons, just print a normal click to
				// start message
			} else {

				// add text to the screen, which tells the human player to click to play again
				// this is centered at half the height, and half the width of the screen, which
				// is the same as halfway in each directon, or the perfect middle
				gc.fillText("Click to start!", intWidth / 2, intHeight / 2);

			}

			// reset the positon of the ball, by assigning its width to half of the screen,
			// which means that is its halfway down the middle. do the same for the height
			// of the screen, so that now it is set in the middle both vertically and
			// horizontall, which is the perfect middle
			dblBallXPos = intWidth / 2;
			dblBallYPos = intHeight / 2;

			// here, we generate a random number between 0 and 1
			// this is in order to decide which direction the ball will go in when the game
			// starts, with +1 being right, and -1 being left
			// if the number is == 0 assign the speed of the ball as equal to 1, whic means
			// the ball starts going to the right
			if (new Random().nextInt(2) == 0) {

				// make the xspeed of the ball = +1
				intBallXSpeed = 1;

				// otherwise, if the number generated is not 0, assign the speed of the ball as
				// equal to -1 which means the ball starts going to the right
			} else {

				// make the xspeed of the ball = -1
				intBallXSpeed = -1;

			}

			// the same thing we did with the xposition uptop, is done here with the
			// ypositon, generating a random number, and then moving the ball either up or
			// down to start accordingly

			// if the number is == 0 assign the speed of the ball as equal to 1, which means
			// the ball starts going to the top
			if (new Random().nextInt(2) == 0) {

				// make the yspeed of the ball = +1
				intBallYSpeed = 1;

				// otherwise, if the number generated is not 0, assign the speed of the ball as
				// equal to -1 which means the ball starts going to the bottom
			} else {

				// make the yspeed of the ball = -1
				intBallYSpeed = -1;

			}

		}

		// if the ypositon of the ball is greater than the height of the screen, or if
		// the yposition of the ball is lower than the ground
		// i.e, if it hits the top or the bottom of the screen
		// invert the direction of the ball, and go the other way
		if (dblBallYPos > intHeight || dblBallYPos < 0) {

			// here, we set the speed of the ball to -1, which means that it inverts the
			// speed of the ball. In simple terms,
			// by invergin the speed of the ball, we are pretty much inverting its direction
			// aswell, which means that once the
			// ball hits a paddle, it switches directions, and starts going the opposite way
			intBallYSpeed *= -1;

		}

		// if the xpositon of the ball is greater than the xpositon of player 2 + its
		// width (i.e the total size of the player paddle)
		// this means that the ball is past the player and off the screen, so we can add
		// a point to the other point, and resetting the game
		if (dblBallXPos < intPlayerOneXPos - PLAYER_WIDTH) {

			// increment the counter for the first player's score
			intScoreP2++;
			// set the boolean for the game start to false, in order to restart the game,
			// and check for a win, or the score
			bolGameStarted = false;

		}

		// if the xpositon of the ball is greater than the xpositon of player 2 + its
		// width (i.e the total size of the player paddle)
		// this means that the ball is past the player and off the screen, so we can add
		// a point to the other point, and resetting the game
		if (dblBallXPos > intPlayerTwoXPos + PLAYER_WIDTH) {

			// increment the counter for the second player's score
			intScoreP1++;
			// set the boolean for the game start to false, in order to restart the game,
			// and check for a win, or the score
			bolGameStarted = false;

		}

		//// simillarly to the signum line below, this line was not created by us.
		//// Rather, it was a solution found online.
		// This came after much struggle and effort, as this line was likely the most
		// difficult one for us to develop.
		// unfortunatley, the only logical solution was to resort to the inernet, where
		// we found this ingenious solution.

		// first, it cheks if the x positon of the ball + its radius, are greater than
		// the xpos of player two (meaning that it is past player two and off screen)
		// then, it checks if the y position of the ball, is higher than the ypos of the
		// player two (since it would have headed off of the screen into a corner)
		// then, it checks if the y positon of the ball is less than or equal to the
		// postion of the player two + the width of the paddle (i.e the)
		if (((dblBallXPos + BALL_SIZE > intPlayerTwoXPos) && dblBallYPos >= dblPlayerTwoYPos && dblBallYPos <= dblPlayerTwoYPos + PLAYER_HEIGHT)
				|| ((dblBallXPos < intPlayerOneXPos + PLAYER_WIDTH) && dblBallYPos >= dblPlayerOneYPos && dblBallYPos <= dblPlayerOneYPos + PLAYER_HEIGHT)) {

			// here, we check the current direction of the ball, and then increase the speed
			// of the ball by one in that direction
			// therefore, we check first if the speed of the ball is greater than 0, which
			// The reason we have to make sure the ball
			// speed is already gerater than 1 is because if we added 1 to the speed, and it
			// was going left for example, that would mean we would pretty much be doing the
			// calculation (-1 +1), which would result in a slower speed, not a faster one
			// like we want

			// if the current speed > 0 it would mean it is going in the right direction, if
			// so, then increment the speed of the ball in the x direction by +1 to the
			// right, so its faster by 1
			if (intBallXSpeed > 0) {

				// add +1 to the speed of the ball, so its faster going to the right by 1
				intBallXSpeed += 1;

				// otherwise, if the ball is not going in the right directon, that means it is
				// automatically going in the left direction, so we increase the speed by -1,
				// which makes the speed going left faster by 1
			} else {

				// add -1 to the speed of the ball, so its faster going to the left by 1
				intBallXSpeed -= 1;

			}

			// we then do the same thing for the ypositon, execpt, instead of moving left or
			// right by 1, we increment up or down by 1
			// if the current speed > 0 it would mean it is going in the up direction, if
			// so, then increment the speed of the ball in the y direction by +1 up
			// , so its faster by 1
			if (intBallYSpeed > 0) {

				// add +1 to the speed of the ball, so its faster going up by 1
				intBallYSpeed += 1;

				// otherwise, if the ball is not going in the up directon, that means it is
				// automatically going in the down direction, so we increase the speed by -1,
				// which makes the speed going down faster by 1
			} else {

				// add -1 to the speed of the ball, so its faster going down by 1
				intBallYSpeed -= 1;

			}

			// this works in the same way to the same line above, by inverting the direction
			// of the ball
			// by making the xpseed inverted, that means it goes in the opposite direction,
			// however, by making the y speed of the ball as *= 1, that means that the ball
			// inverses in the opposite direction from where it came, and that is what we
			// want. If we kept it as -1, it would not deflect in the opposite direction,
			// but rather go straight back from where it came, which is incorrect physics
			intBallXSpeed *= -1;
			intBallYSpeed *= 1;

		}

		// drawing the score of each player by filling the screen with the first
		// player's score, and then
		// some spaces, and then the second players score. The last argument is the
		// position, intWidth / 2, 100
		// centers the text
		gc.fillText(intScoreP1 + "\t\t\t\t\t\t\t\t" + intScoreP2, intWidth / 2, 100);

		// drawing the 2 players, by using the fillRect command, which fills a
		// rectangle, which is the paddles,
		// taking in parameters for the xpos, ypos, width, height
		// we do this twice to put a player rectangle on each side of the screen
		gc.fillRect(intPlayerTwoXPos, dblPlayerTwoYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
		gc.fillRect(intPlayerOneXPos, dblPlayerOneYPos, PLAYER_WIDTH, PLAYER_HEIGHT);

	}

	// the main method, when using the JavaFX library, hardly any code is inserted
	// into the main method
	// when using this library, the main line is the launch(args) line, which
	// launchs the javafx app
	public static void main(String[] args) {

		// the launch(args) line, is a standalone applocation, and can only be called
		// once in a program. It runs the
		// JavaFX package, with args being any command line arguments which may be
		// needed in the program
		// generally, this line does not change between JavaFx apps
		launch(args);

	}
}