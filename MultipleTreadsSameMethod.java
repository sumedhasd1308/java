package Java_coding_Assignment;

public class MultipleTreadsSameMethod 
{
	
		
		public static void main(String[] args)
		{
		    Runnable t1 = new Runnable()
		    {
		        public void run() 
		        {
		        	
		           Multiple_Threads_Add_method.add(1, 2);
		        }
		    };

		    Runnable t2 = new Runnable() 
		    {
		        public void run() 
		        {
		            
		        	Multiple_Threads_Add_method.add(3, 4);
		        }
		    };
		    
		    Runnable t3 = new Runnable() 
		    {
		        public void run() 
		        {
		        	Multiple_Threads_Add_method.add(5, 5);

		        }
		    };
		    
		    new Thread(t3).start();

		    new Thread(t1).start();
		    new Thread(t2).start();
		   
	   }
	}


		

