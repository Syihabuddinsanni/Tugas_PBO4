package LATIHAN2;

    public class Test {
        public static void main(String[] args) {
             Line hab = new Line(12,32,32,2);
             System.out.println(hab.getLength());
             System.out.println(hab.isGreater(hab, hab));
             System.out.println(hab.isLess(hab, hab));
             System.out.println(hab.isEqual(hab, hab));
        }
 
    }
    

