import java.util.ArrayList;
class AdjacencyList{
    static class Edge{
        int src  ;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){ // creating new arrylist at each index of array of arrylist graph
            graph[i] = new ArrayList<Edge>(); 
        }

        //adding edges into graph
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));

    }

    public static void main(String args[]){
        int v = 4; //total vertices
        ArrayList<Edge> graph[] = new ArrayList[v];
        //initially the array of arraylist graph is filled with null values, need an empty arrylist 
        AdjacencyList.createGraph(graph);
        //printing neighbours of a vertex
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(" "+e.dest);
        }
    }
}