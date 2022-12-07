package forEachLoops;

public class Intro {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        for (int newNumbers:numbers) {
            System.out.print(newNumbers);
        }
        // foreach looplarda index numarasına ulaşamayız. sadece elemanları baştan başlayarak sona kadar kontrol edebiliriz. sınırlama yapamayız sadece datastructure kontrolü yapabiliriz başlangıç ve bitişi vermeden. başlangıç ve bitiş otomatik olarak atanır. ilk elamandan son elemana kadar işlem yapar.

    }
}
