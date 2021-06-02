package com.example.projectdmain;

public class Moving {
    public static int[][] brush;
    public static int[][] check1;
    public static int[][] check2;
    public boolean GG = false;
    public static void check() {
        for ( int i = 0 ; i < 3; ++i)
        {
            for (int j = 0; j < 3; j++)
            {
                brush[i][j] = check1[i][j];
            }
        }
        java.util.Arrays.deepEquals(check1, check2);
    }
    public static void setarr() {
        brush = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
    }
    public static void left() {
        int nc = 0;
        for (int i = 3; i >= 0; i--) {
            if (brush[i][0] != 0) {
                if (brush[i][1] != 0) {
                    if (brush[i][0] == brush[i][1]) {
                        brush[i][0] = brush[i][1] * 2;
                        brush[i][1] = 0;
                        if (brush[i][2] != 0) {
                            if (brush[i][3] != 0) {
                                if (brush[i][2] == brush[i][3]) {
                                    brush[i][2] = brush[i][3] * 2;
                                    brush[i][3] = 0;
                                }
                            }
                        }
                    }
                } else {
                    if (brush[i][2] != 0) {
                        if (brush[i][0] == brush[i][2]) {
                            brush[i][0] = brush[i][2] * 2;
                            brush[i][2] = 0;
                        }
                    } else {
                        if (brush[i][3] != 0) {
                            if (brush[i][0] == brush[i][3]) {
                                brush[i][0] = brush[i][3] * 2;
                                brush[i][3] = 0;
                            }
                        }
                    }
                }
            } else {
                if (brush[i][1] != 0) {
                    if (brush[i][2] != 0) {
                        if (brush[i][1] == brush[i][2]) {
                            brush[i][1] = brush[i][2] * 2;
                            brush[i][2] = 0;
                        }
                    } else {
                        if (brush[i][3] != 0) {
                            if (brush[i][1] == brush[i][3]) {
                                brush[i][1] = brush[i][3] * 2;
                                brush[i][3] = 0;
                            }
                        }
                    }
                } else {
                    if (brush[i][2] != 0) {
                        if (brush[i][3] != 0) {
                            if (brush[i][2] == brush[i][3]) {
                                brush[i][2] = brush[i][3] * 2;
                                brush[i][3] = 0;
                            }
                        }
                    }
                }
            }
            if (brush[i][0] == 0 && brush[i][1] != 0) {
                brush[i][0] = brush[i][1];
                brush[i][1] = 0;
            } else {
                if (brush[i][0] == 0 && brush[i][2] != 0) {
                    brush[i][0] = brush[i][2];
                    brush[i][2] = 0;
                } else {
                    if (brush[i][0] == 0 && brush[i][3] != 0) {
                        brush[i][0] = brush[i][3];
                        brush[i][3] = 0;
                    }
                }
            }
            int swapCount = 0;
            int lastIndex = 3;
            for (int m = lastIndex - 1; m >= 0; m--) {
                if (brush[i][m] == 0) {
                    brush[i][m] = brush[i][lastIndex - swapCount];
                    brush[i][lastIndex - swapCount] = 0;
                    swapCount++;
                }
            }
            if (brush[i][3] == 0) nc++;
        }
        soviet:
        if (nc > 0) {
            int nulls = 0;
            int v = (int) Math.ceil(Math.random() * nc);
            for (int nn = 0; nn <= 3; nn++) {
                if (brush[nn][3] == 0) {
                    nulls++;
                    if (nulls == v) {
                        brush[nn][3] = 2;
                        break soviet;
                    }
                }
            }
        }
    }
    public static void up() {
        int nc = 0;
        for (int i = 3; i >= 0; i--) {
            if (brush[0][i] != 0) {
                if (brush[1][i] != 0) {
                    if (brush[0][i] == brush[1][i]) {
                        brush[0][i] = brush[1][i] * 2;
                        brush[1][i] = 0;
                        if (brush[2][i] != 0) {
                            if (brush[3][i] != 0) {
                                if (brush[2][i] == brush[3][i]) {
                                    brush[2][i] = brush[3][i] * 2;
                                    brush[3][i] = 0;
                                }
                            }
                        }
                    }
                } else {
                    if (brush[2][i] != 0) {
                        if (brush[0][i] == brush[2][i]) {
                            brush[0][i] = brush[2][i] * 2;
                            brush[2][i] = 0;
                        }
                    } else {
                        if (brush[3][i] != 0) {
                            if (brush[0][i] == brush[3][i]) {
                                brush[0][i] = brush[3][i] * 2;
                                brush[3][i] = 0;
                            }
                        }
                    }
                }
            } else {
                if (brush[1][i] != 0) {
                    if (brush[2][i] != 0) {
                        if (brush[1][i] == brush[2][i]) {
                            brush[1][i] = brush[2][i] * 2;
                            brush[2][i] = 0;
                        }
                    } else {
                        if (brush[3][i] != 0) {
                            if (brush[1][i] == brush[3][i]) {
                                brush[1][i] = brush[3][i] * 2;
                                brush[3][i] = 0;
                            }
                        }
                    }
                } else {
                    if (brush[2][i] != 0) {
                        if (brush[3][i] != 0) {
                            if (brush[2][i] == brush[3][i]) {
                                brush[2][i] = brush[3][i] * 2;
                                brush[3][i] = 0;
                            }
                        }
                    }
                }
            }
            if (brush[0][i] == 0 && brush[1][i] != 0) {
                brush[0][i] = brush[1][i];
                brush[1][i] = 0;
            } else {
                if (brush[0][i] == 0 && brush[2][i] != 0) {
                    brush[0][i] = brush[2][i];
                    brush[2][i] = 0;
                } else {
                    if (brush[0][i] == 0 && brush[3][i] != 0) {
                        brush[0][i] = brush[3][i];
                        brush[3][i] = 0;
                    }
                }
            }
            int swapCount = 0;
            int lastIndex = 3;
            for (int m = lastIndex - 1; m >= 0; m--) {
                if (brush[m][i] == 0) {
                    brush[m][i] = brush[lastIndex - swapCount][i];
                    brush[lastIndex - swapCount][i] = 0;
                    swapCount++;
                }
            }
            if (brush[3][i] == 0) nc++;
        }
        soviet:
        if (nc > 0) {
            int nulls = 0;
            int v = (int) Math.ceil(Math.random() * nc);
            for (int nn = 0; nn <= 3; nn++) {
                if (brush[nn][3] == 0) {
                    nulls++;
                    if (nulls == v) {
                        brush[nn][3] = 2;
                        break soviet;
                    }
                }
            }
        }
    }
    public static void right() {
        int nc=0;
        for (int i = 3; i >= 0; i--) {
            for (int x = 2; x >= 0; x--) {
                int r = x + 1;
                int t = r + 1;
                int w = t + 1;
                if (brush[i][x] != 0) {
                    if (brush[i][x] == brush[i][r]) {
                        brush[i][x] = 0;
                        brush[i][r] = 2 * brush[i][r];
                    }
                    if (brush[i][r] == 0) {
                        brush[i][r] = brush[i][x];
                        brush[i][x] = 0;
                        if (t <= 3) {
                            if (brush[i][r] == brush[i][t]) {
                                brush[i][r] = 0;
                                brush[i][t] = 2 * brush[i][t];
                            }
                            if (brush[i][t] == 0) {
                                brush[i][t] = brush[i][r];
                                brush[i][r] = 0;
                                if (w <= 3) {
                                    if (brush[i][w] == 0) {
                                        brush[i][w] = brush[i][t];
                                        brush[i][t] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (brush[0][i] == 0) nc++;
        }
        soviet:
        if (nc > 0) {
            int nulls = 0;
            int v = (int) Math.ceil(Math.random() * nc);
            for (int nn = 0; nn <= 3; nn++) {
                if (brush[nn][3] == 0) {
                    nulls++;
                    if (nulls == v) {
                        brush[nn][3] = 2;
                        break soviet;
                    }
                }
            }
        }
    }
    public static void down() {
        int nc = 0;
        for (int i = 3; i >= 0; i--) {
            for (int x = 2; x >= 0; x--) {
                int r = x + 1;
                int t = r + 1;
                int w = t + 1;
                if (brush[x][i] != 0) {
                    if (brush[x][i] == brush[r][i]) {
                        brush[x][i] = 0;
                        brush[r][i] = 2 * brush[r][i];
                    }
                    if (brush[r][i] == 0) {
                        brush[r][i] = brush[x][i];
                        brush[x][i] = 0;
                        if (t <= 3) {
                            if (brush[r][i] == brush[t][i]) {
                                brush[r][i] = 0;
                                brush[t][i] = 2 * brush[t][i];
                            }
                            if (brush[t][i] == 0) {
                                brush[t][i] = brush[r][i];
                                brush[r][i] = 0;
                                if (w <= 3) {
                                    if (brush[w][i] == 0) {
                                        brush[w][i] = brush[t][i];
                                        brush[t][i] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (brush[0][i] == 0) nc++;
        }
        soviet:
        if (nc > 0) {
            int nulls = 0;
            int v = (int) Math.ceil(Math.random() * nc);
            for (int nn = 0; nn <= 3; nn++) {
                if (brush[nn][3] == 0) {
                    nulls++;
                    if (nulls == v) {
                        brush[nn][3] = 2;
                        break soviet;
                    }
                }
            }
        }
    }
}
