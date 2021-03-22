package lab5;

public class Home_activity_2 {

	public static void main(String[] args) {
		Book b=new Book();
		b.setAuthor("Zeeshan");
		String[] r=new String [20];
		r[0]="abc";
		r[1]="def";
		r[2]="ghi";
		r[3]="jkl";
                b.setChapters(r);
                String[] s=new String [20];
		s[0]="abc";
		s[1]="def";
		s[2]="ghi";
		Book b1=new Book("Maan",s);
		
		b.compareBooks(b, b1);
		if(b.compare)
		{
			System.out.println("\nAuthor is SAME");
		}
		b.comparech(b1, b);

	}

}
