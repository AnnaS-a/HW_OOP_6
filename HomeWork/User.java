public class User implements Sign, Persister{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public void save() {
		System.out.println("Save user: " + name);
	}

	@Override
    public void report() {
        System.out.println("Report for user: " + name);
    }
}
