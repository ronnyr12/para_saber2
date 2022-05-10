package com.company.q2;

public class Main {
    public static void main(String[] args) {
        Hotel[] hotels = new Hotel[]{new Hotel("butikos", "michmanim", 5),
                new Hotel("lo butik", "atlantis", 2),
                new Hotel("bed and pillow hotel", "las palmas siam", 5),
                new Hotel("sleepOn", "tel amar", 3),
                new Hotel("sh sh sh", "tel aviv", 2),
                new Hotel("hostelria", "acre", 3),
                new Hotel("bedding", "las palmas siam", 5),
                new Hotel("yes butik", "atlantis", 4)};
        //int result = rating(hotels);
        //System.out.println(result);
        //updateHotel(hotels, "sleepOn", 2);

        /*String str = "Stam";
        System.out.println(str.compareTo("stam"));*/
        int[] stam = {0,21,2,3,4,5,6,7,8,9};
        stop(stam, 3);
    }
    public static void stop(int[] arr,int n ){
        for (int val :arr) {
            System.out.println(val);
            if(val==n)
                return;
        }
    }
    public static void updateHotel(Hotel[] hotels, String name, int rate) {
        boolean go = true;
        for (int i = 0; i < hotels.length && go; i++) {
            if(hotels[i].getName().equals(name)){
                hotels[i].setRate(rate);
                go = false;
            }
        }
    }

    public static int rating(Hotel[] hotels){
        int[] stars = new int[4];   //2,3,4,5
        for (int i = 0, r=0; i < hotels.length; i++) {
            r = hotels[i].getRate();
            stars[r-2]++;
        }
        int indx=0, maxRate=0;
        for (int i = 0; i < stars.length; i++) {
            System.out.println("hotels with "+(i+2)+" stars :"+stars[i]);
            if(stars[i]>maxRate){
                indx = i+2;
                maxRate = stars[i];
            }
        }
        return indx;
    }
}
