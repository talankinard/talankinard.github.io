package iterator;

/**
 * Represents each song through name, artist, lenght, and genre.
 * 
 * @author talan
 */
public class Song 
{
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    public Song(String name, String artist, double length, Genre genre)
    {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Returns a the descriptions associated with that song
     * 
     * @return formatted String using name, artist, genre, and length
     */
    public String toString()
    {
        return name+" by "+artist+" category "+genre+" length "+String.format("%.2f", length)+" min";
    }
}
