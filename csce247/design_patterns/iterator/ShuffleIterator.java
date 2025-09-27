package iterator;
import java.util.Iterator;
import java.util.Random;

public class ShuffleIterator implements Iterator<Song>
{
    private Song[] song;
    private Random rand;

    public ShuffleIterator(Song[] songs)
    {
        this.song = songs;
        this.rand = new Random ();
    }

    public boolean hasNext()
    {
        for(Song s: song) //temp var to hold current element
        {
            if(s != null)
            {
                return true;
            }
        }
        return false;
    }
    
    public Song next()
    {
        int randIndex = rand.nextInt(song.length);

        if(!hasNext())
        {
            return null;
        }

        while(song[randIndex] == null)
        {
            randIndex = rand.nextInt(song.length);
        }

        Song result = song[randIndex];
        song[randIndex] = null; //no repreats
        return result;
    }
}
