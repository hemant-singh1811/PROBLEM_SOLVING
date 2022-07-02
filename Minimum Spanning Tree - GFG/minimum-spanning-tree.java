// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Node{
	int val;
	Node parent;
	int rank;
}

public class DSU {

	HashMap<Integer,Node> map=new HashMap<>();
	
	void create(int x)
	{
		Node nn=new Node();
		nn.val=x;
		nn.parent=nn;
		nn.rank=0;
		
		map.put(x, nn);
	}
	
	public Node find(Node x)
	{
		if(x==x.parent)
		{
			return x;
		}
		
		Node rr=find(x.parent);
		x.parent=rr;
		return rr;
	}
		
	public void union(int x,int y)
	{
		Node s1=find(map.get(x));
		Node s2=find(map.get(y));
		
		if(s1.val==s2.val) return ;
		
		if(s1.rank>s2.rank)
		{
			s2.parent=s1;
		}
		else if(s1.rank<s2.rank)
		{
			s1.parent=s2;
		}else {
			s1.parent=s2;
			s2.rank++;
		}	
	}
}

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        		ArrayList<edgespair> edges = getedges(adj);
		Collections.sort(edges); 
		DSU dsu = new DSU();

		int ans=0;
		int i=0;
		int n=adj.size();
		for (i=0;i<n;i++) {
			dsu.create(i); 
		}

		for (edgespair e : edges) {
			Node p1 = dsu.find(dsu.map.get(e.v1));
			Node p2 = dsu.find(dsu.map.get(e.v2));

			if (p1.val == p2.val)
				continue;

// System.out.println(e.v1+" "+e.v2+" "+e.wt);
			dsu.union(e.v1, e.v2);
			ans+= e.wt;
		}

		return ans; 
    }
    
    static ArrayList<edgespair> getedges(ArrayList<ArrayList<ArrayList<Integer>>> adj){
        
        ArrayList<edgespair> edges=new ArrayList<>();
        int i=0;    
        
        for(ArrayList<ArrayList<Integer>> nbrs:adj){
            
            // System.out.println("s " +nbrs.size());
            // ArrayList<Integer> nbr=nbrs.get(0);
            // ArrayList<Integer> wt=nbrs.get(1);
            // System.out.println(nbr.size());
            // System.out.println(wt.size());
            
            for(ArrayList<Integer> nbr:nbrs){
                
                edgespair e=new edgespair();
                e.v1=i;
                e.v2=nbr.get(0);
                e.wt=nbr.get(1);
            //   System.out.println(nbr.get(0));
               
            //   System.out.println(nbr.get(1));
               edges.add(e);   
            }
            i++;
        }
        return edges;
    }
}

class edgespair implements Comparable<edgespair>{
    int v1,v2,wt;
    public int compareTo(edgespair o) {
		return this.wt - o.wt;
	}
}
