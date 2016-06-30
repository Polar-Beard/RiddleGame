import java.util.ArrayList;
import java.util.Scanner;

public class TextAdventure
{
  private List<Checkpoint> masterCheckpoints;
  private List<Path> masterPaths;

  public TextAdventure()
  {
    this.masterCheckpoints = new ArrayList<Checkpoint>();
    this.masterPaths = new ArrayList<Path>();
  }
}
