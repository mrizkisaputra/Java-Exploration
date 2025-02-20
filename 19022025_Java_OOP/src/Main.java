public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Bubu");
        Animal dog = new Dog("Anjing");
        Animal animal = new Animal("Animal");

        User user1 = new User("John", "Doe");
        User user2 = new User("John", "Doe");
        
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("clicked!!");
            }
        });

        Person person1 = new Person("kiki", 23);
        Person person2 = new Person("kiki", 23);
        System.out.println(person1.equals(person2));

        try {
            String[] arr = {"data1", "data2", "data3"};
            System.out.println(arr[100]);
        } catch (Exception e) {
            var stackTrace = e.getStackTrace();

            e.printStackTrace();
        }
    }

    @Kadaluarsa(value = "dd")
    private static void setOnClickListener(OnClickListener onClickListener) {
        onClickListener.onClick();
    }
}
