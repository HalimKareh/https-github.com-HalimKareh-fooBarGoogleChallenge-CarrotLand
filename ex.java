public static int answer(int[][] vertices) { 

      int x1 = vertices[0][0], y1=vertices[0][1],
            x2=vertices[1][0],y2=vertices[1][1],
            x3=vertices[2][0],y3=vertices[2][1];
	    int triangleArea = Math.abs(((x1-x2)*(y1+y2)) + ((x2-x3)*(y2+y3)) + ((x3-x1)*(y3+y1)));
	    int excludingPoints = Math.abs(gcd(x1-x2,y1-y2))+ Math.abs(gcd(x2-x3, y2-y3))+ Math.abs(gcd(x3-x1, y3-y1));
	    triangleArea/=2;
	    triangleArea+=1;
	    return (triangleArea - excludingPoints/2);
    } 
    public static int gcd(int a, int b) {
  	    if(a == 0 || b == 0) return a+b; // base case
  	    return gcd(b,a%b);
	}
