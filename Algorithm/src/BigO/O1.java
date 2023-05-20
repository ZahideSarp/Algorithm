package BigO;

// Array ne kadar buyuk olursa olsun , algoritmanin calistirilma suresi hep sabit kalacaktir

public class O1 {  // O(1)  ---> Constant Complexity:Örnegin algoritmam 10.000 saniye de calısıyor aynı algoritmayı
    // 100 elemanla da test etsem ,1milyon elemanla da test etsem 10.000 sn gorurum.
    //-->   ??peki hangi algoritmalarda constant complexity ile karsılasırım?
    //Eleman sayısından bagımsız olarak algoritmanin sonuca varması için gecen süre hep sabit.
    //Array ne kadar buyuk olursa olsun, algoritmanin calistirilma süresi hep sabit kalacaktır
    //Hep ilk sıradakini getiren ya da girilen sayı tekmi çift mi gibi algoritmalar constant complexity'e sahiptir.

    public static void main(String[] args) {

        int[] arr = {10, 2, 5, 34, 56, 435367543, 34343, 34344, 3434};
        // arrayin son elemanini ekrana yazdiralim
        System.out.println(arr[arr.length-1]);
    }

}
