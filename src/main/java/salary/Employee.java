package salary;


public class Employee {
	private int id;
	private String user;
	private float salary;

	public Employee( final int id, final String user, final float salary )
	{
		this.id = id;
		this.user = user;
		this.salary = salary;
	}

	public int getId()
	{
		return id;
	}

	public void setId( final int id )
	{
		this.id = id;
	}

	public String getUser()
	{
		return user;
	}

	public void setUser( final String user )
	{
		this.user = user;
	}

	public float getSalary()
	{
		return salary;
	}

	public void setSalary( final float salary )
	{
		this.salary = salary;
	}
}
