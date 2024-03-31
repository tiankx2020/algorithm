package com.tkx.java.leecode周赛.D391;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tkx
 * @Date 2024 03 31
 **/
public class T4 {
    public int minimumDistance(int[][] points) {
        int index1 = -1, index2 = -1;
        int maxDistance = Integer.MIN_VALUE;
        int length = points.length;
        int[][] distance = new int[length][length];
        List<Paix> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                distance[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                distance[j][i] = distance[i][j];
                if (distance[i][j] > maxDistance) {
                    maxDistance = distance[i][j];
                    list = new ArrayList<>();
                    list.add(new Paix(i, j));
                } else if (distance[i][j] == maxDistance) {
                    list.add(new Paix(i, j));
                }
            }
        }
        if(list.size()>0) return maxDistance;
        int res = Integer.MAX_VALUE;
        for (Paix paix : list) {
            int x = paix.x;
            int y = paix.y;
            int temp1 = Integer.MIN_VALUE;
            int temp2 = Integer.MIN_VALUE;
            for (int i = 0; i < length; i++) {
                if (i != y) temp1 = Math.max(temp1, distance[i][x]);
            }
            for (int i = 0; i < length; i++) {
                if (i != x) temp2 = Math.max(temp2, distance[i][y]);
            }
            res = Math.min(res, Math.min(temp1, temp2));
        }
        return res;
    }

    class Paix {
        int x;
        int y;

        public Paix(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
