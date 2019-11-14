
package TUGASPRAKTIKUM;
public class Test {
    public static void main(String[] args) {
        Rect x=new Rect();
        Rect y=new Rect(3,3);
        y.move(1,1);
        int x1=y.x1;
        int x2=y.x2;
        int y1=y.y1;
        int y2=y.y2;
        
        System.out.println("awal (" +x1+ "," +x2+ "," +y1+ "," +y2+ ")");
        Rect main=new Rect(x1,y1,x2,y2);
        System.out.println("<2,3> inside the union= " +main.isInside(2, 3));
        Rect last=new Rect(2,3,5,6);
        x=main.union(last);
        
        int a=x.x1;
        int b=x.x2;
        int c=x.y1;
        int d=x.y2;
        
        System.out.println("(1,1,4,4) Union (2,3,5,6) = (" +a+ "," +c+ "," +b+ "," +d+ ")");
        x=main.interesection(last);
        
        int q=x.x1;
        int w=x.x2;
        int e=x.y1;
        int t=x.y2;
        
        System.out.println("(1,1,4,4) Union (2,3,5,6) = (" +q+ "," +w+ "," +e+ "," +t+ ")");
    }
}
