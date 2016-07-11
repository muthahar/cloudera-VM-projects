import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;


public class StubDriver extends Configured implements Tool {

  @Override
  public int run(String[] args) throws Exception {
    if(args.length != 2) {
      throw new IllegalArgumentException("Bad number of arguments: "
          + args.length);
    }
    String input = args[0];
    String output = args[1];
    
    JobConf conf = new JobConf(getConf(), StubDriver.class); // TODO change
    conf.setJobName(this.getClass().getName());

    // TODO implement
    
    JobClient.runJob(conf);
    return 0;
  }

  public static void main(String[] args) throws Exception {
    StubDriver driver = new StubDriver(); // TODO change
    int exitCode = ToolRunner.run(driver, args);
    System.exit(exitCode);
  }
}