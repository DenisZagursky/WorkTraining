import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dzenyaa on 18.09.2017.
 */
public class CacheFileEventLogger extends FileEventLogger {
    int cacheSize;
    List<Event> cache;

    CacheFileEventLogger(String a,String s)
    {
        super(s);
        cacheSize=Integer.parseInt(a);
        cache=new ArrayList<Event>(cacheSize+1);

    }
    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size()==cacheSize)
        {
            WriteEventsFromCache();
            cache.clear();
        }
    }

    private void WriteEventsFromCache() {
        file=new File(filename);
        try {
            for (int i=0;i<cache.size();i++) {
                FileUtils.writeStringToFile(file, cache.get(i).toString());
                FileUtils.writeStringToFile(file,"/n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void destroy(){
        if(!cache.isEmpty())
        {
            WriteEventsFromCache();
        }
    }
}
