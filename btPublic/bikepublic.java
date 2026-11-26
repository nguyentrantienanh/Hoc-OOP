class Bike {

        public String mau_sac;
        public String kich_thuoc;
        public String thuong_hieu;
        public String loai_xe;
        public double gia_ban;
        private double gia;

        public Bike(){
             mau_sac = "mau huong canh xen";
             kich_thuoc = "lon";
             thuong_hieu = "Honda";
             loai_xe = "xe may";
             gia_ban = 4500;
        }

        public Bike(int gia,String mau){
            this.mau_sac = mau;
            this.gia_ban = gia;
        }

        public Bike(int gia, String mau, String kichthuoc, String thuonghieu, String loai){
            this.gia_ban = gia;
            this.mau_sac = mau;
            this.kich_thuoc = kichthuoc;
            this.thuong_hieu = thuonghieu;
            this.loai_xe = loai;
        }


        // method không tham số <void>
        public void InThongTinXe()
        {
            System.out.println("xe so 3 dung void");
            System.out.println(this.gia_ban);
        }
        public void inthongtin() {
            System.out.println("xe so  4");
            System.out.println("Mau sac: " + this.mau_sac);
            System.out.println("Kich thuoc: " + this.kich_thuoc);
            System.out.println("Thuong hieu: " + this.thuong_hieu);
            System.out.println("Loai xe: " + this.loai_xe);
            System.out.println("Gia ban: " + this.gia_ban);
        }

        // thêm methods lock và unlock
        // public void lock() {
        //     System.out.println("Tat / khoa xe");
        // }

        // public void unlock() {
        //     System.out.println("Mo khoa xe");
        // }
        // private InThongTin
        private void InThongTin() {
            System.out.println("Day la xe dap");
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

            bike_3.InThongTinXe();

            Bike bike_4 = new Bike(5000000, "Trang", "Nho", "Ducati", "Xe the thao");
            bike_4.inthongtin();

            // XE SỐ 5 Private
            System.out.println("xe so 5: ");
            Bike bike_5 = new Bike();
            bike_5.gia = 250000;
            System.out.println("Gia xe 5 (private): " + bike_5.gia);
            bike_5.InThongTin();
            // bike_5.lock();
            // bike_5.unlock();            
    }
}