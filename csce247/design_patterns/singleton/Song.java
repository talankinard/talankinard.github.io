package singleton;

import java.io.File;

public class Song 
{
    private String title;
    private String artist;
    private String fileName;

    //construct
    public Song(String title, String artist, String fileName)
    {
        this.title = title;
        this.artist = artist;
        this.fileName = fileName;
    }

    public String toString()
    {
        return title+" by "+artist; 
    }

    public void play()
    {
        System.out.println("Playing "+title+" by "+artist); //output
        SongPlayer.play(fileName);
    }


}
