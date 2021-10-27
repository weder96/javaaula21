package Pack20DesignPatterns.OthersDesignPatterns.EventQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Event or message queues provide an asynchronous communications protocol, meaning that the sender
 * and receiver of the message do not need to interact with the message queue at the same time.
 * Events or messages placed onto the queue are stored until the recipient retrieves them. Event or
 * message queues have implicit or explicit limits on the size of data that may be transmitted in a
 * single message and the number of messages that may remain outstanding on the queue. A queue
 * stores a series of notifications or requests in first-in, first-out order. Sending a notification
 * enqueues the request and returns. The request processor then processes items from the queue at a
 * later time.
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Program entry point.
   *
   * @param args command line args
   * @throws IOException                   when there is a problem with the audio file loading
   * @throws UnsupportedAudioFileException when the loaded audio file is unsupported
   */
  public static void main(String[] args) throws UnsupportedAudioFileException, IOException,
      InterruptedException {
	  Audio audio = Audio.getInstance();

	  Class clazz = App.class;
      audio.playSound(audio.getAudioStream(clazz.getResource("/etc/Bass-Drum-1.wav").toString()), -10.0f);
      audio.playSound(audio.getAudioStream(clazz.getResource("/etc/Closed-Hi-Hat-1.wav").toString()), -8.0f);

      LOGGER.info("Press Enter key to stop the program...");
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        br.read();
      }
      audio.stopService();
  }
}
