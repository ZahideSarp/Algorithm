package Sorting_Algorithms.QuickSort;

public class QuickSort {

    // yardimci method
    public static int partition(int dizi[], int alt, int ust){

        // dizinin son elamani pivot seciliyor
        int pivot = dizi[ust];//ust=2 pivot=4
        //neden dizi[lenght-1] degilde dizi[ust] dedik Cunku lenght-1 dersek ilk pivottan sonra 2 ayrı array olusmayacak indexler üzerinden gidecegiz
        //lengt-1 dersek hep array'in en son elemanını alır.

        int i = (alt-1);//i=-1
        // alt ve ust sinir arasindaki elemanlari pivot ile
        // karsilastirip kucuk olanlari sola atiyorum
        for(int j= alt; j<ust; j++){//j=0

            if(dizi[j]<= pivot) {//3<4
                i++;//i=0
                int temp = dizi[i];//temp=3
                dizi[i] = dizi[j];//dizi[0]=dizi[0] !!! SOR
                dizi[j]= temp;//dizi[0]=3
            }
        }
        // pivot elemanin dizideki dogru konumu icin :
        int temp = dizi[i+1];//temp=5
        dizi[i+1] = dizi[ust];//dizi[1]=4
        dizi[ust]= temp;//dizi[2]=5 -->[3,4,5]

        return i+1;

    }

    // ana method
    public static void quickSort(int dizi[], int alt, int ust){
//burada verecegim alt ve ust degerler partition'a parametre olarak verecegimiz alt ve ust degerler olacak
        if(alt<ust){

            int pi = partition(dizi, alt,ust);
            quickSort(dizi,alt,pi-1); // pivotun sol tarafi icin calisir
            quickSort(dizi,pi+1,ust); // pivotun  sag tarafi icin calisir

        }

    }
}