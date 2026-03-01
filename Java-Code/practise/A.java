import java.io.*;
import java.util.*;

public class Solution {
    static int N, M;
    static char[][] g;
    static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    static boolean inside(int r,int c){
        return r>=0 && c>=0 && r<N && c<M;
    }

    static HashSet<String> getPath(int sr,int sc,char ch){
        HashSet<String> vis=new HashSet<>();
        Queue<int[]> q=new ArrayDeque<>();
        q.add(new int[]{sr,sc});
        vis.add(sr+" "+sc);
        while(!q.isEmpty()){
            int[] cur=q.poll();
            for(int[] d:dirs){
                int nr=cur[0]+d[0], nc=cur[1]+d[1];
                String key=nr+" "+nc;
                if(inside(nr,nc)&& g[nr][nc]==ch && !vis.contains(key)){
                    vis.add(key);
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return vis;
    }

    static ArrayList<int[]> getEnds(char ch){
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(g[i][j]==ch && (i==0||i==N-1||j==0||j==M-1))
                    list.add(new int[]{i,j});
            }
        }
        return list;
    }

    static boolean checkFree(ArrayList<int[]> inter, HashSet<String> cable, int mask){
        HashSet<String> block=new HashSet<>();
        for(int i=0;i<inter.size();i++)
            if(((mask>>i)&1)==1) block.add(inter.get(i)[0]+" "+inter.get(i)[1]);

        ArrayList<int[]> ends=new ArrayList<>();
        for(String s:cable){
            String[] p=s.split(" ");
            int r=Integer.parseInt(p[0]), c=Integer.parseInt(p[1]);
            if(r==0||r==N-1||c==0||c==M-1) ends.add(new int[]{r,c});
        }

        int ok=0;
        for(int[] st:ends){
            Queue<int[]> q=new ArrayDeque<>();
            HashSet<String> vis=new HashSet<>();
            q.add(st);
            vis.add(st[0]+" "+st[1]);
            boolean esc=false;
            while(!q.isEmpty()){
                int[] cur=q.poll();
                int r=cur[0],c=cur[1];
                if(r==0||r==N-1||c==0||c==M-1){
                    esc=true;break;
                }
                for(int[] d:dirs){
                    int nr=r+d[0],nc=c+d[1];
                    String key=nr+" "+nc;
                    if(inside(nr,nc)&&cable.contains(key)&&!vis.contains(key)&&!block.contains(key)){
                        vis.add(key);
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            if(esc) ok++;
        }
        return ok==ends.size();
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        g=new char[N][M];
        for(int i=0;i<N;i++) g[i]=br.readLine().toCharArray();

        ArrayList<int[]> cEnds=getEnds('C');
        ArrayList<int[]> rEnds=getEnds('R');

        HashSet<String> cable = new HashSet<>();
        if(!cEnds.isEmpty()) cable=getPath(cEnds.get(0)[0],cEnds.get(0)[1],'C');

        HashSet<String> rod = new HashSet<>();
        if(!rEnds.isEmpty()) rod=getPath(rEnds.get(0)[0],rEnds.get(0)[1],'R');

        ArrayList<int[]> inter=new ArrayList<>();
        int initMask=0, idx=0;
        for(String s:rod){
            if(cable.contains(s)){
                String[] p=s.split(" ");
                int r=Integer.parseInt(p[0]),c=Integer.parseInt(p[1]);
                inter.add(new int[]{r,c});
                if(g[r][c]=='R') initMask|=(1<<idx);
                idx++;
            }
        }

        int K=inter.size();
        Queue<Integer> q=new ArrayDeque<>();
        HashMap<Integer,Integer> dist=new HashMap<>();
        q.add(initMask);
        dist.put(initMask,0);

        while(!q.isEmpty()){
            int mask=q.poll();
            int cost=dist.get(mask);
            if(checkFree(inter,cable,mask)){
                System.out.println(cost);
                return;
            }
            for(int i=0;i<K;i++){
                int nm=mask^(1<<i);
                if(!dist.containsKey(nm)){
                    dist.put(nm,cost+1);
                    q.add(nm);
                }
            }
        }
        System.out.println(0);
    }
}
