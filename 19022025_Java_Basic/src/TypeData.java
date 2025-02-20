public class TypeData {
    public static void main(String[] args) {
//        typeDataPrimitif();
        typeDataObject();
    }

    public static void typeDataPrimitif() {
        byte valueByte = 10;
        short valueShort = 100;
        int valueInt = 1000;
        long valueLong = 10_000;
        float valueFloat = 10_000;
        double valueDouble = 100_000d;
        char valueChar = 'A';
        boolean isMarried = false;

        short byteToShort = valueByte;
        short longToShort = (short) valueLong;


        System.out.println(valueShort);
    }

    public static void typeDataObject() {
        String hello = "Hello World";
        Integer valueInt = 100;
        Long valueLong = 10_000L;
        Double valueDouble = 10.00;
        Boolean isMarried = true;
    }
}
