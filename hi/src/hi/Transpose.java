package hi;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int Tmat[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{ for(int j=0;j<3;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
		}
		for(int i=0;i<3;i++)
		{ for(int j=0;j<3;j++)
		{
			Tmat[j][i]=mat[i][j];
		}		
		}
		System.out.println("Transpose of Matrix is");
		for(int i=0;i<3;i++)
		{ for(int j=0;j<3;j++)
		{
			System.out.print(Tmat[i][j]+" ");
		}
		System.out.println();
		}

	}



	}


