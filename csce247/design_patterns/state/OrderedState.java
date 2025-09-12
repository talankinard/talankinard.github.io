public class OrderedState extends State
{
    public OrderedState(Package pkg)
    {
        super(pkg);
    }

    @Override 
    public String getStatus()
    {
        String subject = "The "+pkg.formatName();
        String beVerb = pkg.getVerb("is", "are");
        return subject+" "+beVerb+" ordered.";
    }

    @Override
    public String getETA()
    {
        int days=2; //defauly deliv time
        StringBuilder sb = new StringBuilder();

        if(random.nextInt(100)<20) //rnadom chance of 20% to add 1-3 days
        {
            int extra = random.nextInt(3)+1; //delay adds 1-3 days
            days+=extra;

            //delay msg
            String subject="The "+pkg.formatName();
            String hasVerb=pkg.getVerb("has", "have");
            //long line starts w The x object, add space, adds the fiting verb, then new line
            sb.append(subject).append(" ").append(hasVerb).append(" experienced a delay in manufacturing.").append("\n");
        }

        //final msg
        //same concept as before 
        sb.append("The ").append(pkg.formatName()).append(" will be shipped within ").append(days).append(" business days.");
        return sb.toString();
    }
}