public class Checkpoint
{
  private String prompt;
  private List<Path> paths;

  public Checkpoint(String prompt)
  {
    this.prompt = prompt;
    this.paths = new ArrayList<Path>();
  }

  private void createPaths(List<String> steps)
  {
    for(int i = 0; i < steps.size(); i++)
    {
      paths.add(new Path(this, steps.get(i)));
    }
  }
}
