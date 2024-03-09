



public class ForEach {
public static void main(String[] args) {
// int i;
// int arr [] = new int[5];


//     for(i=0;i<arr.length; i++)
//     {
        
//         System.out.println( arr[i] =(int) (Math.random()*10));
//     }
// }

int num[][] = {{1,2},{3,4}};
              
for(int i[] : num)
{
    for(int j : i)
    System.out.println(j);
}
}
}
