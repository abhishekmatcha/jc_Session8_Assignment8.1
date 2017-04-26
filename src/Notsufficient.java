

public class Notsufficient extends RuntimeException
{
	private String message;
	public Notsufficient(String message) 
	{ 
		this.message = message; 
		} public Notsufficient(Throwable cause, String message)
		{ 
			super(cause);
			this.message = message;
			}
		public String getMessage()
		{
			return message; 
			}
		}

