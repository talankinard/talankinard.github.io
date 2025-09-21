package singleton;

import java.util.ArrayList;

public class JukeBox 
{
    private static JukeBox instance;
    private ArrayList<Song> songs;

    private JukeBox() 
    {
        //loaded frum dataloader
        songs = DataLoader.getSongs();
        if (songs == null) 
        {
            songs = new ArrayList<>();
        }
    }


    public static JukeBox getInstance()
     {
        if (instance == null) 
        {
            instance = new JukeBox();
        }
        return instance;
    }

    public ArrayList<Song> getAllSongs() 
    {
        return songs;
    }

    public Song requestSong(int number)
    {
        if(number >= 0 && number<=songs.size())
        {
            Song song = songs.get(number);
            song.play();
            return song;
        }

        System.out.println("Please choose between 1 and" + songs.size() + ".");
        return null;

    }

}
