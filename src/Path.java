public class Path
{
  private Checkpoint origin;
  private Checkpoint destination;
  private String step;

  public Path(Checkpoint origin, String step)
  {
    this.origin = origin;
    this.step = step;
  }

  public void setDestination(Checkpoint destination)
  {
    this.destination = destination;
  }
}
