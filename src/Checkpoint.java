public class Checkpoint
{
  private String prompt;
  private List<Path> paths;

  public Checkpoint(String prompt)
  {
    this.prompt = prompt;
    this.paths = new ArrayList<Path>();
  }

  //Takes number of paths to make
  private void createPaths(int num)
  {
    for(int i = 0; i < num; i++)
    {
      paths.add(new Path(this));
    }
  }
}
