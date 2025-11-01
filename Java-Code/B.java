import java.util.*;

public class B {
    static int n, m;
    static char[][] g;
    static boolean[][] cable;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static boolean inside(int x, int y) {
        return x>=0 && y>=0 && x<n && y<m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new char[n][m];
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<m;j++) g[i][j] = s.charAt(j);
        }

        cable = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(g[i][0]=='C'){cable[i][0]=true; q.add(new int[]{i,0});}
            if(g[i][m-1]=='C'){cable[i][m-1]=true; q.add(new int[]{i,m-1});}
        }
        for(int j=0;j<m;j++){
            if(g[0][j]=='C'){cable[0][j]=true; q.add(new int[]{0,j});}
            if(g[n-1][j]=='C'){cable[n-1][j]=true; q.add(new int[]{n-1,j});}
        }

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            for(int k=0;k<4;k++){
                int nx = x+dx[k], ny = y+dy[k];
                if(inside(nx,ny) && !cable[nx][ny] && g[nx][ny]=='C'){
                    cable[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }

        boolean[][] mark = new boolean[n][m];
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]=='R'){
                    boolean cross=false;
                    for(int k=0;k<4;k++){
                        int nx=i+dx[k], ny=j+dy[k];
                        if(inside(nx,ny) && cable[nx][ny]) { cross=true; break; }
                    }
                    if(!cross) continue;

                    if(!mark[i][j]){
                        ans++;
                        Queue<int[]> qq = new LinkedList<>();
                        qq.add(new int[]{i,j});
                        mark[i][j]=true;

                        while(!qq.isEmpty()){
                            int[] cur = qq.poll();
                            int x=cur[0], y=cur[1];
                            for(int k=0;k<4;k++){
                                int nx=x+dx[k], ny=y+dy[k];
                                if(inside(nx,ny) && !mark[nx][ny] && g[nx][ny]=='R'){
                                    boolean t=false;
                                    for(int kk=0;kk<4;kk++){
                                        int tx=nx+dx[kk], ty=ny+dy[kk];
                                        if(inside(tx,ty) && cable[tx][ty]) {t=true;break;}
                                    }
                                    if(t){
                                        mark[nx][ny]=true;
                                        qq.add(new int[]{nx,ny});
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
