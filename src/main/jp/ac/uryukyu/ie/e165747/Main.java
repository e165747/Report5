package jp.ac.uryukyu.ie.e165747;

/**
 * Created by e165747 on 2016/12/02.
 */
public class Main {
    public static void main(String[] args){
        String str = null;
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("str error:NullPointerException\n");
            e.printStackTrace();
        }
    }
}

