class FinalValAftOp {
    public static void main(String[] args) {
        String[] ops = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(ops));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int value = 0;

        for(String val:operations) {
            if(val == "++X" || val == "X++") {
                value++;
            } else {
                value--;
            }
        }
        return value;
    }
}