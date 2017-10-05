import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dzenyaa on 17.09.2017.
 */
public class FileEventLogger implements EventLogger {
        String filename;
        File file;

    public FileEventLogger(String s) {
        filename=s;
    }

    public FileEventLogger() {
    }
    public void logEvent(Event event) {
         file=new File(filename);
        try {
            FileUtils.writeStringToFile(file,event.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void init() throws  IOException
    {this.file=new File (filename);
    file.canWrite();
    }
}
