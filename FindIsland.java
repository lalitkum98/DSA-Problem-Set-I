package RePracticeAlgo;

public class FindIsland {

	/**
	 * @param args
	 */
	public int findIslands(int arr[][]){
		int islands=0;
		int visited[][] = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if( arr[i][j]==1 && visited[i][j]!=1){
					findIsland(arr,visited,i,j);
					islands++;
				}
				
			}
		}
		
		return islands;
		
	}
	
	public void findIsland(int arr[][], int visited[][], int i , int j){
		if(i>=arr.length|| j>=arr[0].length)
			return;
		if(arr[i][j]==0)
			return;
		if(visited[i][j]!=1)
			visited[i][j]=1;
				
		findIsland(arr,visited,i+1,j);
		findIsland(arr,visited,i,j+1);
		findIsland(arr,visited,i+1,j+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[][]{
				{ 1, 0, 1, 1, 0},
				{ 1, 0, 0, 1, 0},
				{ 0, 0, 0, 0, 0},
				{ 1, 0, 0, 0, 1}
			
		};
		
		FindIsland FI = new FindIsland();
		System.out.println(FI.findIslands(array));
	}

}
