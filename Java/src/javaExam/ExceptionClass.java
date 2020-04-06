package javaExam;

public class ExceptionClass {int data=10;
void calulate() throws Exception
{
	try
	{
		data++;
		try
		{
			data++;
			try
			{
				data++;
				throw new Exception();
			}
			catch(Exception e)
			{
				data++;
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			data++;
		}
	}
	catch(Exception e)
	{
		//data++;
	}
}
	void display()
	{
		System.out.println(data);
	}

	public static void main(String[] args) throws Exception {
		
		ExceptionClass exceptionClass = new ExceptionClass();
		exceptionClass.calulate();
		exceptionClass.display();
	}

}
