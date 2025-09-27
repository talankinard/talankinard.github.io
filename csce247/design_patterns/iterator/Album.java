package iterator;
import java.util.Iterator;
public class Album 
{
    private Song[] songs; //store in array
    private int count;
    private String name;

    public Album(String name)
    {
        this.name = name;
        this.songs = new Song[25]; //fixed array size, can store 25 songs per album
        this.count = 0;
    }

    public boolean addSong(String name, String artist, double length, Genre genre)
    {
        if(count >= songs.length)
        {
            return false;
        }
        songs[count++] = new Song(name, artist, length,  genre);
        return true;
    }

    public Iterator<Song> createInOrderIterator()
    {
        return new InOrderIterator(songs);
    }

    public Iterator<Song> createShuffleIterator()
    {
        return new ShuffleIterator(songs);
    }

    public String getName()
    {
        return name;
    }
}
