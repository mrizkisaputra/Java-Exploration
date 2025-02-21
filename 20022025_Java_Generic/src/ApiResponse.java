public class ApiResponse<T> {
    private String status;
    private final T data;

    public ApiResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
