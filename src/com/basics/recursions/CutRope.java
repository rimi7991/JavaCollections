//package com.basics.recursions;
//
//public class CutRope {
//    public static int cutRope(int n, int a,int b,int c)
//    {
//        int res;
//        if (n == 0)
//            return 0;
//        if(n<0)
//            return -1;
//        {
//            if(cutRope(n-a,a,b,c)>cutRope(n-b,a,b,c) && cutRope(n-a,a,b,c)> cutRope(n-c,a,b,c))
//                res = cutRope(n-a,a,b,c);
//            else if(cutRope(n-b,a,b,c)>cutRope(n-c,a,b,c) && cutRope(n-b,a,b,c)> cutRope(n-a,a,b,c))
//                res = cutRope(n-b,a,b,c);
//            else if(cutRope(n-c,a,b,c)>cutRope(n-a,a,b,c) && cutRope(n-c,a,b,c)> cutRope(n-b,a,b,c))
//                res = cutRope(n-c,a,b,c);
//        }
//        if(res == -1)
//            return -1;
//        else
//            return res+1;
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
