public class Report implements Persister{
    private String name;
    
    public Report(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void report() {
        System.out.println(name);
    }

}
