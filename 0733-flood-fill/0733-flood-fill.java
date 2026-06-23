class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old=image[sr][sc];
        if(old==color)
            return image;
        dfs(image,sr,sc,color,old);
        return image;
    }
    public void dfs(int[][]img,int i,int j,int nc,int oc)
    {
        if(i<0||j<0||i>=img.length||j>=img[0].length||img[i][j]!=oc)
            return;
        img[i][j]=nc;
        dfs(img,i+1,j,nc,oc);
        dfs(img,i-1,j,nc,oc);
        dfs(img,i,j+1,nc,oc);
        dfs(img,i,j-1,nc,oc);
    }
}