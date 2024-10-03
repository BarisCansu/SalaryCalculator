package org.example;

public class Mudurler extends Calisanlar implements Servis, OzelSofor, OzelAraba{

    public Mudurler(String calisanIsim, String calisanSoyisim, int maas, int yemekYardim, int yolParasi, int ekCalismaSaati) {
        super(calisanIsim, calisanSoyisim, maas, yemekYardim, yolParasi,ekCalismaSaati);
    }

    @Override
    public int yillikPrim() {
        return 2*maas;
    }

    @Override
    public int ekMesai() {
        return ekCalismaSaati*maas/225;
    }

    @Override
    public boolean servisiVar() {
        return false;
    }

    @Override
    public boolean ozelSofor() {
        return false;
    }

    @Override
    public boolean ozelAraba() {
        return true;
    }
}
