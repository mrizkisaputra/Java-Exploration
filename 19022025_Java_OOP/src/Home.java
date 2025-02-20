public class Home {
    private int luas = 100;

    public class Room {
        public double getLuasRoom() {
            return (double) Home.this.luas / 50;
        }
    }
}
