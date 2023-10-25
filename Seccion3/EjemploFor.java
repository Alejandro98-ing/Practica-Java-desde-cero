class EjemploFor{
	public static void main(String[] args) {
		for(int j=1;j<=20;j++){
			System.out.println("\nImprimiendo tabla del "
				+j+"\n");
			for(int i=1;i<=10;i++){
				System.out.println(j
					+"x"+i+"="+(j*i));
			}
		}
	}
}