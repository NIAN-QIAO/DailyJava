package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

class Solution240404 {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<Integer>[] g = new ArrayList[n];
        Arrays.setAll(g, i -> new ArrayList<>());
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
        }
        List<Integer>[] ans = new ArrayList[n];
        Arrays.setAll(ans, i -> new ArrayList<>());
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        for (int start = 0; start < n; start++) {
            dfs(start, start, g, vis, ans);
        }
        return Arrays.asList(ans);
    }

    private void dfs(int x, int start, List<Integer>[] g, int[] vis, List<Integer>[] ans) {
        vis[x] = start;
        for (int y : g[x]) {
            if (vis[y] != start) {
                ans[y].add(start);
                dfs(y, start, g, vis, ans);
            }
        }
    }
}

public class medium240404 {
    public static void main(String[] args) {

    }
}