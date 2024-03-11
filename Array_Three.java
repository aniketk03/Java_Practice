public class Array_Three {
//3d Array
  public static void main(String[] args) {
    int arr[][][]=new int[2][2][2];
    int i,j,k;
    for(i=0;i<arr.length;i++)
    {
        for(j=0;j<arr[i].length;j++)
        {
            for(k=0;k<arr[i][j].length;k++)
            {
                arr[i][j][k]=(int)(Math.random()*10);
                System.out.print(arr[i][j][k]);
            }
            System.out.println("");
        } 
    
    }
  }
}