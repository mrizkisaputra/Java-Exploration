public class Main {
    public static void main(String[] args) {

        ApiResponse<String> response1 = new ApiResponse<>("success", "data string");
        ApiResponse<Integer> response2 = new ApiResponse<>("success", 100);


        Integer[] data = {1,2,3,4,5,6};
        GenericMethod gm = new GenericMethod();
        var result = gm.<Integer>getLength(data);
        System.out.println(result);


        process(response1);
    }

    public static void process(ApiResponse<? extends Object> apiResponse) {
        System.out.println(apiResponse.getData());
    }
}