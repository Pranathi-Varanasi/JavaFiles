
public class NumberThread extends Thread{
	

	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try{
				Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			}
		}
	}

}
