package LATIHAN3;

    public class PembayaranGaji {
        public int hitungGaji (Pegawai peg){
            int uang = peg.gaji();
            if (peg instanceof Direktur)
                uang+=((Direktur)peg).tunjangan();
                if (peg instanceof Staf )
                uang+= ((Staf)peg).Bonus();
                return uang;
                
        }
        public static void main(String[] args) {
            PembayaranGaji pg = new PembayaranGaji();
            Staf damar  = new Staf ();
            Direktur Syihab = new Direktur();
            System.out.println("Gaji Yang dibayarkan untuk Staf =" +pg.hitungGaji(damar));
            System.out.println("Gaji Yang dibayarkan untuk Direktur = " +pg.hitungGaji(Syihab));
        }
    
}
