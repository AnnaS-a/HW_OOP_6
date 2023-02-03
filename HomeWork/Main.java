public class Main{
	public static void main(String[] args){
		User user = new User("Михаил");
		Report report = new Report("'Квартальный отчет по выручке от продаж'");
		User user1 = new User("Яна");
		Report report1 = new Report("'Авансовый отчет'");

		user.report();
		report.report();
		user.save();

		user1.report();
		report1.report();
		user1.save();
	}
}