package org.example;

public class Patronlar extends Calisanlar implements Servis, OzelSofor, OzelAraba{

   private int yillikKardanPay;

    public Patronlar(String calisanIsim, String calisanSoyisim, int maas, int yemekYardim, int yolParasi, int yillikKardanPay, int ekCalismaSaati) {
        super(calisanIsim, calisanSoyisim, maas, yemekYardim, yolParasi, ekCalismaSaati);
        this.yillikKardanPay = yillikKardanPay;
    }

    @Override
    public int yillikPrim() {
        return 3*maas;
    }

    public int getYillikKardanPay() {
        return yillikKardanPay;
    }

    public void setYillikKardanPay(int yillikKardanPay) {
        this.yillikKardanPay = yillikKardanPay;
    }

    @Override
    public int ekMesai() {
        return 0;
    }

    @Override
    public boolean servisiVar() {
        return false;
    }

    @Override
    public boolean ozelSofor() {
        return true;
    }

    @Override
    public boolean ozelAraba() {
        return true;
    }
}
