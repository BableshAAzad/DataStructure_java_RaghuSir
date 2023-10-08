class CustomImplementRunnable implements Runnable{
	Thread t;
	CustomImplementRunnable(String name){
		t = new Thread(this,name);
		//t.start();
	}
	public void start(){
		t.start();
	}
	public void run(){
		for (int i=1;i<=10;i++){
			System.out.println(t.getName() + ": " + i);
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException ie){}
		}
	}
	
	public static void main(String [] args){
		CustomImplementRunnable ct1 = new CustomImplementRunnable("Thread One");
		CustomImplementRunnable ct2 = new CustomImplementRunnable("Thread Two");
		CustomImplementRunnable ct3 = new CustomImplementRunnable("Thread Three");
		ct1.start();
		ct2.start();
		ct3.start();
		for(int i=1;i<=10;i++){
			System.out.println("From Main:" + i);
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException ie){}
		}
	}
}
			
		
		
			