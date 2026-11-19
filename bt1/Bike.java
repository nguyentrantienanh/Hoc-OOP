public class Bike {

        String mau_sac;
        String kich_thuoc;
        String thuong_hieu;
        String loai_xe;
        double gia_ban;

        Bike(){
             mau_sac = "mau huong canh xen";
             kich_thuoc = "lon";
             thuong_hieu = "Honda";
             loai_xe = "xe may";
             gia_ban = 4500;
        }
        Bike(int gia,String mau){
            this.mau_sac = mau;
            this.gia_ban = gia;
        }
        Bike(int gia, String mau, String kichthuoc, String thuonghieu, String loai){
            this.gia_ban = gia;
            this.mau_sac = mau;
            this.kich_thuoc = kichthuoc;
            this.thuong_hieu = thuonghieu;
            this.loai_xe = loai;
        }
        public static void main(String[] a){
            Bike myBike = new Bike();
            System.out.println("mau sac:" + myBike.mau_sac);

            Bike bike_2 = new Bike(10000, "xanh");
            System.out.println("xe so 2: ");
            System.out.println("gia ban: " + bike_2.gia_ban);
            System.out.println("mau sac: " + bike_2.mau_sac);
            
            Bike bike_3 = new Bike(3000000, "den", "Vua", "Yamaha", "Xe dap");
            System.out.println("xe so 3");
            System.out.println("mau sac: " + bike_3.mau_sac);
            System.out.println("Kich thuoc: " + bike_3.kich_thuoc);
            System.out.println("Thuong hieu: " + bike_3.thuong_hieu);
            System.out.println("Loai xe: " + bike_3.loai_xe);
            System.out.println("Gia: " + bike_3.gia_ban);
        }
        
    }