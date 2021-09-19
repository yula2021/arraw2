package org.itstep;

public class Arraws2 {
    public static void main(String[] args) {
        //Дан массив. Вычислить среднее арифметическое для его неповторяющегося подмножества.
        Arraw.fillOrder();
        Arraw.print();
        Arraw.arr [3] = 1;
        Arraw.print();
        int [] b = new int[Arraw.arr.length];
        b[0] = Arraw.arr[0];
        int length = Arraw.arr.length;
        int count = 1;
        for (int i = 1; i < length; i++){
            boolean flag = false;
            for (int j = 0; j < count; j++)
                if (Arraw.arr[i] == b[j])
                    flag = true;
                if (!flag) b [count] = Arraw.arr[i]
                        b[count] ++;
        }

    }
}
