package DynamicProgramming;

/**
 * Created by bhuvanabellala on 1/28/17.
 */
public class PrimMST {

    public static void primMST(int[][] graph){



    }


    public static void main (String[] args)
    {
        /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0},
        };

        // Print the solution
        ///primMST(graph);

        int n = 6;

        for(int i = 0; i < n ; i++){
            for(int j = 1; j <= n; j++){
                if(j + i >= 6 ){
                    System.out.print("#");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
