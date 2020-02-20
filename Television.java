
public class Television {

	private final String MANUFACTURER;
	private final int SCREEN_SIZE; 
	private boolean powerOn;
	private int channel;
	private int volume ;
	
		public Television (String brand, int size)
		{
			MANUFACTURER= brand;
			SCREEN_SIZE = size;
			powerOn = false ;
			volume = 20 ;
		}
		
		public void setChannel(int station)
		{
			
			station = 0;
			
		}
		
		public void power()
		{
			
			
			
		}
		
		public void increaseVolume()
		{
			
			
		}
		
		public void decreaseVolume()
		{
			
			
		}

		public String getChannel() 
		{
			return station;
			
		}

}

