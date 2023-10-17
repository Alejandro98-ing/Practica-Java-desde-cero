import java.util.Arrays;

public class ArreglosDeCadaTipo {

	public static void main(String[] args) {
		boolean arrayBoolean[] = new boolean[3];
		arrayBoolean[0]=true;
		arrayBoolean[1]=false;
		arrayBoolean[2]=true;
		
		byte arrayByte[] = new byte[3];
		arrayByte[0]= 10;
		arrayByte[1]= -120;
		arrayByte[2]= 127;
		
		short arrayShort[] = new short[3];
		arrayShort[0]= 15000;
		arrayShort[1]= -30000;
		arrayShort[2]= 32767;
		
		int arrayInt[] = new int[3];
		arrayInt[0]= 1;
		arrayInt[1]= -327;
		arrayInt[2]= 256;
		
		char arrayChar[] = new char[3];
		arrayChar[0]= 'a';
		arrayChar[1]= 'b';
		arrayChar[2]= 'c';
		
		float arrayFloat[] = new float[3];
		arrayFloat[0]= 10.2f;
		arrayFloat[1]= 120.5f;
		arrayFloat[2]= 127.7f;
		
		long arrayLong[] = new long[3];
		arrayLong[0]= -9223372036854775808L;
		arrayLong[1]= 1000000000000000000L;
		arrayLong[2]= 9223372036854775807L;
		
		double arrayDouble[] = new double[3];
		arrayDouble[0]= 10.1;
		arrayDouble[1]= -120.3;
		arrayDouble[2]= 127.9;
		
		System.out.println("Arreglo de tipo boolean: \n"+Arrays.toString(arrayBoolean));
		System.out.println("Arreglo de tipo byte: \n"+Arrays.toString(arrayByte));
		System.out.println("Arreglo de tipo short: \n"+Arrays.toString(arrayShort));
		System.out.println("Arreglo de tipo int: \n"+Arrays.toString(arrayInt));
		System.out.println("Arreglo de tipo char: \n"+Arrays.toString(arrayChar));
		System.out.println("Arreglo de tipo float: \n"+Arrays.toString(arrayFloat));
		System.out.println("Arreglo de tipo long: \n"+Arrays.toString(arrayLong));
		System.out.println("Arreglo de tipo double: \n"+Arrays.toString(arrayDouble));
	}

}
