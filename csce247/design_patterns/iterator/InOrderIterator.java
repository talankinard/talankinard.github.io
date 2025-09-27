package iterator;
import java.util.Iterator;

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
        
    public Song next()
    {
        if(!hasNext())
        {
            return null;
        }
        return song[position++];
    }
}
