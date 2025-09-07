public class BlueBerry extends ScoopDecorator {
    public BlueBerry(IceCream base, int n) { super(base, n); }
    @Override protected String colorCode() { return ANSI_BLUE; }
}