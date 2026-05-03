package ARRAY_OF_OBJECT;

public class MainHS {
    public static void main(String[] args) {
        HS[] hs = new HS[2];

        hs[0] = new HS(1, "A", 8.5);
        hs[1] = new HS(2, "B", 9.0);

        for (HS s : hs) {
            s.display();
        }
    }
    
}
