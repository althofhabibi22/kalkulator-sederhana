public class math {
    public static void main(String[] args) {
        penjumlahan jumlah = new penjumlahan(5,5);
        pengurangan kurang = new pengurangan(5,5);
        perkalian kali = new perkalian(5,5);
        pembagian bagi = new pembagian(5,5);
        akar akar = new akar(5);
        kuadrat kuadrat = new kuadrat(5);
    }

    private static class penjumlahan {
        public penjumlahan(int a, int b){
            System.out.print("hasil penjumlahan = ");
            System.out.println(a+b);
        }
        
    }
    private static class pengurangan {
        public pengurangan(int a, int b){
            System.out.print("hasil pengurangan = ");
            System.out.println(a-b);
        }
        
    }
    private static class perkalian {
        public perkalian(int a, int b){
            System.out.print("hasil perkalian = ");
            System.out.println(a*b);
        }
        
    }
    private static class pembagian {
        public pembagian(int a, int b){
            System.out.print("hasil pembagian = ");
            System.out.println(a/b);
        }
        
    }
    private static class kuadrat {
        public kuadrat(int a){
            System.out.print("hasil kuadrat = ");
            System.out.println(Math.pow(a, a));
        }
        
    }
    private static class akar {
        public akar(int a){
            System.out.print("hasil akar = ");
            System.out.println(Math.sqrt(a));
        }
        
    }
}
