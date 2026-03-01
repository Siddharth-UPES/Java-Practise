import java.util.*;
public class B {
    static int n, m;
    static char[][] a;
    static boolean[][] vis;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean inside(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
        }
        vis = new boolean[n][m];
        int ans = 0;
        // Check every R that touches a C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'R' && !vis[i][j]) {
                    boolean touchesCable = false;
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dx[k], nj = j + dy[k];
                        if (inside(ni, nj) && a[ni][nj] == 'C') {
                            touchesCable = true;
                            break;
                        }
                    }
                    if (touchesCable) {
                        ans++;
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[]{i, j});
                        vis[i][j] = true;
                        while (!q.isEmpty()) {
                            int[] cur = q.poll();
                            int x = cur[0], y = cur[1];
                            for (int k = 0; k < 4; k++) {
                                int nx = x + dx[k], ny = y + dy[k];
                                if (inside(nx, ny) && !vis[nx][ny] && a[nx][ny] == 'R') {
                                    boolean t2 = false;
                                    for (int kk = 0; kk < 4; kk++) {
                                        int tx = nx + dx[kk], ty = ny + dy[kk];
                                        if (inside(tx, ty) && a[tx][ty] == 'C') {
                                            t2 = true;
                                            break;
                                        }
                                    }
                                    if (t2) {
                                        vis[nx][ny] = true;
                                        q.add(new int[]{nx, ny});
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