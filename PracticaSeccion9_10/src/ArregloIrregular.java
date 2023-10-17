
public class ArregloIrregular {

	public static void main(String[] args) {
		char arregloIrregular[][] = new char[11][];
        
        // Inicializar cada sub-arreglo con diferentes tamaños
        arregloIrregular[0] = new char[] { '*' };
        arregloIrregular[1] = new char[] { '*', '*' };
        arregloIrregular[2] = new char[] { '*', '*', '*' };
        arregloIrregular[3] = new char[] { '*', '*', '*', '*' };
        arregloIrregular[4] = new char[] { '*', '*', '*', '*', '*' };
        arregloIrregular[5] = new char[] { '*', '*', '*', '*', '*', '*' };
        arregloIrregular[6] = new char[] { '*', '*', '*', '*', '*' };
        arregloIrregular[7] = new char[] { '*', '*', '*', '*' };
        arregloIrregular[8] = new char[] { '*', '*', '*' };
        arregloIrregular[9] = new char[] { '*', '*' };
        arregloIrregular[10] = new char[] { '*' };
        
        // Acceder e imprimir los elementos del arreglo irregular
        for (int i = 0; i < arregloIrregular.length; i++) {
            for (int j = 0; j < arregloIrregular[i].length; j++) {
                System.out.print(arregloIrregular[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}
