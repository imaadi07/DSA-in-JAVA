class ExampleArrays {
    void demoArray() {
        int [] ages = new int[5];
        float [] weights = new float[5];
        String [] names = new String[5];

        ages[0] = 34;
        weights[0] = 45.698F;
        names[0] = "Aditya";

        System.out.println(ages[0]);
        System.out.println(weights[0]);
        System.out.println(names[0]);
    }

    void multiArray() {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][1]);
    }
}

public class Array {
    public static void main(String[] args) {
        ExampleArrays obj = new ExampleArrays();
        obj.demoArray();
        obj.multiArray();
    }
}
