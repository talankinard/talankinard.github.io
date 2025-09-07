public class Vanilla extends ScoopDecorator {
    public Vanilla(IceCream base, int n) { 
        super(base, n); 
    }
    @Override 
    protected String colorCode() { 
        return ANSI_WHITE; 
    }
}
