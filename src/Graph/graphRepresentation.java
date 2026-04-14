package Graph;

import java.util.ArrayList;

public class graphRepresentation {
    public static void main(String[] args) {
        int n =3,m=3;
        ArrayList<ArrayList<Integer> > adj =new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        // adj.get(u).(v)
        //adj.get(v).(u)

        // edge 1----2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 1-----3
        adj.get(1).add(3);
        adj.get(3).add(1);

        //ege 2-----3
        adj.get(2).add(3);
        adj.get(3).add(2);

        for(int i = 1; i <= n; i++) {
            System.out.print(i + " → ");

            for(int neighbor : adj.get(i)) {      // Much cleaner!
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
}
