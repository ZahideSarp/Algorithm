package BigO;

// elimizdeki veri seti arttikca , algoritmanin calistirilma suresi dogru orantili sekilde artis gosterir

public class On {  // O(n) --> Linear Complexity:

    public static void main(String[] args) {

        // arrayin butun elemanlarini ekrana basalim
        int[] arr ={21, 33, 2, 4, 23, 11};

        for (int item: arr) {
            System.out.println(item + " ,");
        }
    }
}
//Bir algoritmanın time complexity'sine hesaplarken genelde dongu taraflarına bakılır.
//Kac tane for, kac tane if, kac tan while var diye bakılır.Diğer iterasyonlar omit(göz ardı) edilir.
// Çünki CPU ya en cok islem yaptıran kısım buralardır.
//olusturulan fieldlar cok az olacagı için hesaplama da  göz ardı edilir.

















