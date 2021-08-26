package Controller;

public class ThreadV  extends Thread{
	private int v;
	private int vetor[] = new int[1000];
	
	public ThreadV( int v, int vetor [] ){
		this.v=v;
		this.vetor = vetor;
	
	}
	public void run(){
		 contador();
	}
	public boolean ePar(int v){
		if(v % 2 == 0){
			if(v % 2 == 0){
				return true; 
			}
			return false;
			}
		return false;
			}
		public void contador(){
			double  TI, TF, TT;
		   String tipo;
		   TI =System.nanoTime();
			if (ePar(v)){
				tipo="for";
				for(int i = 0; i< vetor.length; i++){}
					
				}
				else{
					tipo = "foreach";
					for(int b : vetor){ 
						b =b+0;
						}
					
					}
			TF= System.nanoTime();
			TT=TF-TI;
			TT=TT/Math.pow(10, 9);
			System.out.println("TID #"+ getId() +" ------> tipo usado: "+ tipo +", Tempo Total: "+ TT + "s.");
			
						
				}
			}