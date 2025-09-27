package iterator;
import java.util.Iterator;

/**
 * 
 * Represents album contatining the collection of songs.
 * Also has the iterators to either shuffle or play the songs in order.
 * 
 * @author talan
 */
public class Album 
{
    private Song[] songs; //store in array
    private int count;
    private String name;

    public Album(String name)
    {
        this.name = name;
        this.songs = new Song[25]; //fixed capacity, can store 25 songs per album which seems pretty general for an album
        this.count = 0;
    }

    /**
     * Populates the array with songs
     * @param name
     * @param artist
     * @param length
     * @param genre
     * @return boolean true if the song was added, false if album full
     */

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
