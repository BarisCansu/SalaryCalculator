package org.example;

public class BeyazYaka extends Calisanlar implements Servis, OzelSofor, OzelAraba{

    public BeyazYaka(String calisanIsim, String calisanSoyisim, int maas, int yemekYardim, int yolParasi, int ekCalismaSaati) {
        super(calisanIsim, calisanSoyisim, maas, yemekYardim, yolParasi, ekCalismaSaati);
    }

    @Override
    public int yillikPrim() {
        return maas;
    }

    @Override
    public int ekMesai() {
        return ekCalismaSaati*maas/225;
    }

    @Override
    public boolean servisiVar() {
        return true;
    }

    @Override
    public boolean ozelSofor() {
        return false;
    }

    @Override
    public boolean ozelAraba() {
        return false;
    }
}
