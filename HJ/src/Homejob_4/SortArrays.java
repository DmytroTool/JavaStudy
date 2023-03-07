package Homejob_4;

import java.util.Arrays;


class SortArrays {



    public static void main (String[]args){

        int[] data = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);

        }
        System.out.println(Arrays.toString(sortSpiral(data)));
        System.out.println(Arrays.toString(sortAsс(data)));
        System.out.println(Arrays.toString(sortDesc(data)));




    }
    public static int[] sortSpiral( int[] data){
        System.out.println("Spiral: ");

        int[] spiral = new int[data.length];
        Arrays.sort(data);

        for (int i = 0; i < data.length; i++) {
            int spiral_pos;
            if (i % 2 == 0) {
                spiral_pos = i / 2;
            } else {
                spiral_pos = data.length - (i / 2) - 1;
            }

            spiral[spiral_pos] = data[data.length - i - 1];

        }

        return spiral;
    }

    public static int[] sortAsс( int[] data) {
        System.out.println("ASC: ");
        Arrays.sort(data);
        //prints array using the for loop
        for (int i = 0; i < data.length; i++) {
            break;
        }
        return data;
    }
    public static int[] sortDesc( int[] data) {
        System.out.println("DESC: ");

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                int temp;
                if (data[i] < data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    break;
                }
            }
        } return data;
    }



}
