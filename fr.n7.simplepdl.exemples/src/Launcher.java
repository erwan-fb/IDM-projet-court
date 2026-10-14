import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.n7.simplePDL.toPetri.Converter;

public class Launcher {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("(.*)/fr\\.n7\\.simplepdl\\.exemples/tests/(.*)\\.simplepdl");
    Matcher matcher;

    File dir = new File("tests");
    File[] files = dir.listFiles();
    for (File f : files) {
      String source = f.getAbsolutePath();
      System.out.println("found file " + f.getName());

      matcher = pattern.matcher(source);
      if (matcher.find()) {
        String destination = matcher.group(1) + "/fr.n7.petri.exemples/" + matcher.group(2) + ".petri";
        
        Converter converter = new Converter();
        converter.setSource(source);
        converter.export(destination);
        
      }
    }
    
    System.out.println("Done converting");
  }
}
