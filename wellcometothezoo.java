public class wellcometothezoo {
    private String eat;
    private String name;
    public String getEat(){
        return eat;
    }
    public void setEat(String eat){
        this.eat =eat ;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class rabbit extends wellcometothezoo{
    private int tai;
    public int getTai()
    {
        return tai;
    }
    public void setTai(int tai)
    {
        this.tai= tai;
    }
}
class tiger extends wellcometothezoo{
    private int chan;
    public int getChan()
    {
        return chan;
    }
    public void setChan(int chan)
    {
        this.chan= chan;
    }
}
class cow extends wellcometothezoo{
    private int sung;
    public int getSung()
    {
        return sung;
    }
    public void setSung(int sung)
    {
        this.sung= sung;
    }
}
class Entry{
    public static void main(String[] args)
    {
        {
            rabbit s = new rabbit();
            s.setName("rabbit");
            s.setEat("carrot");
            s.setTai(2);
            System.out.println("Name: " + s.getName());
            System.out.println("Eat: " + s.getEat());
            System.out.println("legs: " + s.getTai());

        }
        {
            tiger s = new tiger();
            s.setName("tiger");
            s.setEat("meat");
            s.setChan(2);
            System.out.println("Name: " + s.getName());
            System.out.println("Eat: " + s.getEat());
            System.out.println("legs: " + s.getChan());
        }
        {
            cow s = new cow();
            s.setName("cow");
            s.setEat("cokho");
            s.setSung(2);
            System.out.println("Name: " + s.getName());
            System.out.println("Eat: " + s.getEat());
            System.out.println("legs: " + s.getSung());
        }
    }
