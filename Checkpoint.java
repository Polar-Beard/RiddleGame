public class Checkpoint
{
  private static int numOfCheckpoints = 0;

  private ArrayList<String> nextSteps;
  private String question;
  private int ID;

  public Checkpoint(String q)
  {
    this.nextSteps = new ArrayList<String>();
    this.question = q;
    numOfCheckpoints++;
    this.ID = numOfCheckpoints;

  }

  public void printSteps()
  {
    for(int i = 0; i < nextSteps.size(); i++)
    {
      System.out.println((i + 1) + ") " + nextSteps.get(i));
    }
  }

  public void printQuestion()
  {
    System.out.println(this.question);
  }

  public void add(String step)
  {
    this.nextSteps.add(step);
  }
}
