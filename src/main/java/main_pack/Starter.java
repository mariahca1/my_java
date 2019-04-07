package main_pack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Starter {


    public static void main(String[] args) {


/*
        main_pack.Building my_house = new main_pack.Building(10);
        System.out.println(my_house.get_height());
        System.out.println(my_house.get_color());
        System.out.println(my_house.toString());*/
/*
        main_pack.Building[] my_house_arr = new main_pack.Building[5];

        my_house_arr[0] = new main_pack.Building(4);
        my_house_arr[1] = new main_pack.Building(1);
        my_house_arr[2] = new main_pack.Building(5);
        my_house_arr[3] = new main_pack.Building(3);
        my_house_arr[4] = new main_pack.Building(2);


        for (main_pack.Building q : my_house_arr) {
          //  q = new main_pack.Building(1);
            System.out.println(q.toString());
        }
        int[] int_arr = new int[3];
        int_arr[0] = 1;
        int_arr[1] = 3;
        int_arr[2] = 2;
*/


/*
        main_pack.AptBuilding my_AptBuilding = new main_pack.AptBuilding(10,40);
        //my_AptBuilding.Set_Apt_number(40);
        System.out.println(my_AptBuilding.get_height());
        System.out.println(my_AptBuilding.get_color());
        System.out.println(my_AptBuilding.Get_AptNumber());
*/

/*
        Thing t = new main_pack.Building(2);
        System.out.println(t.toString());

        main_pack.Building b = new main_pack.AptBuilding(3,3);
        System.out.println(b.toString());

*/



        /*ArrayList<main_pack.Building> arr = new ArrayList();
        arr.add(new main_pack.Building(1));
        arr.add(new main_pack.Building(3));
        arr.add(new main_pack.Building(2));
        System.out.println(arr);
        arr.sort(new Comparator<main_pack.Building>() {
            @Override
            public int compare(main_pack.Building o1, main_pack.Building o2) {
                return o1.getHeight() - o2.getHeight();
            }
        });
        System.out.println(arr);*/


        Building[] b_arr = new Building[3];
        b_arr[0] = new Building(1);
        b_arr[1] = new Building(3);
        b_arr[2] = new Building(2);

        for (Building q : b_arr) {
            //  q = new main_pack.Building(1);
            System.out.println(q.toString());
        }
        Arrays.sort(b_arr);
        for (Building q : b_arr) {
            //  q = new main_pack.Building(1);
            System.out.println(q.toString());
            System.out.println(q.getFunName());
        }

        String res = "1" == "2" ? "+" : "-";
        System.out.println(res);

    }
}


