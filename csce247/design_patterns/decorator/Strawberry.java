public class Strawberry extends ScoopDecorator {
    public Strawberry(IceCream base, int n) { 
        super(base, n); 
    }
    @Override 
    protected String colorCode() { 
        return ANSI_RED; 
    }
}