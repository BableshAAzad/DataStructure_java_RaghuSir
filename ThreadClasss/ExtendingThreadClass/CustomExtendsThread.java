class CustomExtendsThread extends Thread{
	public CustomExtendsThread(String name){
		super(name);
	}
	
	public void run(){
		for(int i =1;i<=10;i++){
			System.out.println(getName() + ": " + i);
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	
	public static void main(String [] args){
		CustomExtendsThread ct1 = new CustomExtendsThread("Thread One");
		CustomExtendsThread ct2 = new CustomExtendsThread("Thread Two");
		CustomExtendsThread ct3 = new CustomExtendsThread("Thread Three");
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		for(int i=1;i<=10;i++){
			System.out.println("Main Thread: " + i);
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException ie){
				System.out.println("Main Thread Interrupted");
			}
		}
	}
}
		
			