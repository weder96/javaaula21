package Pack20DesignPatterns.OthersDesignPatterns.EventQueue;

import javax.sound.sampled.AudioInputStream;

/**
 * The Event Queue's queue will store the instances of this class.
 *
 * @author mkuprivecz
 */
public class PlayMessage {

  private AudioInputStream stream;

  private float volume;

  public PlayMessage(AudioInputStream stream, float volume) {
    setStream(stream);
    setVolume(volume);
  }

  public AudioInputStream getStream() {
    return stream;
  }

  private void setStream(AudioInputStream stream) {
    this.stream = stream;
  }

  public float getVolume() {
    return volume;
  }

  public void setVolume(float volume) {
    this.volume = volume;
  }
}
