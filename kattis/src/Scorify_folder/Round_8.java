package Scorify_folder;


import java.util.*;


public class Round_8 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Case=sc.nextInt();
		for(int o=0;o<Case;o++){
			int n = sc.nextInt();
			int[][] T = new int[n][n];
			int m = sc.nextInt();
			for(int i=0;i<m;i++){
				T[sc.nextInt()][sc.nextInt()] = sc.nextInt();
			}
		traitement(T,0,0);
		}

	}
	
	public static void  traitement(int[][] M,int count,int i){
	   if(i==4){
	       System.out.println(count);
	       return;
	   } 
	   int[][] tmp1=result(M,i,0);
	        for(int j=0;j<M[i].length;j++){
	        	 int[][] tmp=result(M,i,j);
	       if(tmp[i][j]!=-1 )
	    	   traitement(tmp,count+tmp[i][j],i+1);
	         	   
	        }
	        try{
	        traitement(tmp1,count+tmp1[i][0],i+2); }catch(Exception e){}
	        }
	    
	    
	
	

	private static int[][] result(int[][] m,int ii,int jj) {
		// TODO Auto-generated method stub
	
	int[][] t = m.clone();
			for(int i = 0; i < t.length ; i++){
				t[ii][i] = -1;
				t[i][ii] = -1;
				t[jj][i] = -1;
				t[i][jj] = -1;
				
			}
		return t;

	}

}
