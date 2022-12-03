public class Problem1{

    public static void main(String[] args ){
        int rows = 5;
        Pyramid p = new Pyramid();

        p.mirrored_half_pyramid(rows);
        p.full_pyramid(rows, "*");
        p.inverted_half_pyramid(rows);
        p.inverted_full_pyramid(rows,"*");
        p.number_half_pyramid(rows, 1);
    }
    }