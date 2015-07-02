import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main
{
	
	public static void main(String[] args)
	{
		
		try
		{
			
			URL url = new URL("http://www.bankier.pl/robots.txt");
			
		    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		    
		    String line;
		    while ((line = in.readLine()) != null)
		    {
		    	System.out.println(line);
		    }
		    in.close();
		}
		catch (MalformedURLException e)
		{
			System.out.println("Malformed URL: " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("I/O Error: " + e.getMessage());
		}
	}
}