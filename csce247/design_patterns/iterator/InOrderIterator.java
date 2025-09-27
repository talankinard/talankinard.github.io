package iterator;
import java.util.Iterator;

/**
 * Iterator that displays the songs in order.
 * Skips over null.
 * 
 * @author talan
 */
public class InOrderIterator implements Iterator<Song> 
{
    private Song[] song;
    private int position;

    public InOrderIterator(Song [] songs)
    {
        this.song =songs;
        this.position = 0;
    }

    public boolean hasNext()
    {
        while(position<song.length && song[position] ==null)
        {
            position++;
        }
        return position < song.length;
    }

    /**
     * @return the next song in order or null if none remain
     */
        
    public Song next()
    {
        if(!hasNext())
        {
            return null;
        }
        return song[position++];
    }
}
