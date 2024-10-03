package org.example;

public abstract class Calisanlar {
    String calisanIsim;
    String calisanSoyisim;
    int maas;
    public abstract int yillikPrim ();
    public abstract int ekMesai();
    int yemekYardim;
    int yolParasi;
    int ekCalismaSaati;

    public Calisanlar(String calisanIsim, String calisanSoyisim, int maas, int yemekYardim, int yolParasi, int ekCalismaSaati) {
        this.calisanIsim = calisanIsim;
        this.calisanSoyisim = calisanSoyisim;
        this.maas = maas;
        this.yemekYardim = yemekYardim;
        this.yolParasi = yolParasi;
        this.ekCalismaSaati = ekCalismaSaati;
    }

    public String getCalisanIsim() {
        return calisanIsim;
    }

    public void setCalisanIsim(String calisanIsim) {
        this.calisanIsim = calisanIsim;
    }

    public String getCalisanSoyisim() {
        return calisanSoyisim;
    }

    public void setCalisanSoyisim(String calisanSoyisim) {
        this.calisanSoyisim = calisanSoyisim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getYemekYardim() {
        return yemekYardim;
    }

    public void setYemekYardim(int yemekYardim) {
        this.yemekYardim = yemekYardim;
    }

    public int getYolParasi() {
        return yolParasi;
    }

    public void setYolParasi(int yolParasi) {
        this.yolParasi = yolParasi;
    }

    public int getEkCalismaSaati() {
        return ekCalismaSaati;
    }

    public void setEkCalismaSaati(int ekCalismaSaati) {
        this.ekCalismaSaati = ekCalismaSaati;
    }
}
