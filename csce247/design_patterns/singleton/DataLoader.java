package singleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DataLoader 
{
    public static ArrayList<Song> getSongs()
    {
        ArrayList<Song> list= new ArrayList<>();

        File file = new File("/Users/talankinard/Desktop/VSCode/talankinard.github.io/csce247/design_patterns/singleton/songs.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while((line=br.readLine()) != null)
            {
                line=line.trim();

                if(line.isEmpty()) //continue through empty
                {
                    continue;
                }

                String[] parts = line.split("\\s*,\\s*");

                if(parts.length<3)
                {
                    continue;
                }

                //separate output w assigned values
                String title = parts[0].trim();
                String artist = parts[1].trim();
                String fileName = parts[2].trim(); //get from folder

                
                File f = new File(fileName);
                if (!f.exists()) {
                    
                    String baseFileName = fileName;
                    if (fileName.startsWith("songs/")) //prefix
                    {
                        baseFileName = fileName.substring(6); 
                    }
                    
                    // Try with songs folder in singleton directory
                    File alt = new File("csce247/design_patterns/singleton/songs", baseFileName);
                    if (alt.exists()) {
                        fileName = "csce247/design_patterns/singleton/songs/" + baseFileName;
                    }
                }

                list.add(new Song(title,artist,fileName));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
        return list;
    
    }
}