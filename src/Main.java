import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int dim = 5;
        final Graph graph = new Graph(dim * dim);

        final int[][] H = {
                {1, 1, 1, 1, 1},
                {0, 1, 1, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        {

        };

        final int[][] V = {
                {1, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1}
        };

        // fill horizontal edges
        for (int y = 0; y < dim; ++y) {
            for (int x = 0; x < dim - 1; ++x) {
                int f = y * dim + x;
                int t = f + 1;
                if (V[f / dim][t % dim] == 0) {
                    graph.addEdge(f, t);
                    graph.addEdge(t, f);
                }
            }
        }

        // fill vertical edges
        for (int x = 0; x < dim; ++x) {
            for (int y = 0; y < dim - 1; ++y) {
                int f = y * dim + x;
                int t = f + dim;
                if (H[t / dim][f % dim] == 0) {
                    graph.addEdge(f, t);
                    graph.addEdge(t, f);
                }
            }
        }

        List<Integer> path = graph.breadthFirstSearch(0, dim * dim - 1);
        System.out.println("\nPath for BFS:");
        for (int i = 0; i < path.size(); ++i) {
            int col = path.get(i) / 5;
            int row = path.get(i) % 5;
            System.out.print("(" + row + ", " + col + ")");
            if (i == path.size() - 1) {
                System.out.println();
            } else {
                System.out.print(" -> ");
            }
        }

        List<Integer> path2 = graph.depthFirstSearch(0, dim * dim - 1);
        System.out.println("\nPath for DFS:");
        for (int i = 0; i < path2.size(); ++i) {
            int col = path2.get(i) / 5;
            int row = path2.get(i) % 5;
            System.out.print("(" + row + ", " + col + ")");
            if (i == path2.size() - 1) {
                System.out.println();
            } else {
                System.out.print(" -> ");
            }
        }
    }
}