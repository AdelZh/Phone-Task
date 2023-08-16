public class Notes {
    private String song;
    private String name;

    private int Quantity;

    public Notes(String song, String name, int quantity) {
        this.song = song;
        this.name = name;
        Quantity = quantity;
    }



    public String getName() {
        return name;
    }

    public void getAll(Notes [] notes){
        for(int i=0; i<notes.length; i++){
            System.out.println(notes[i]);
        }
    }



    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "song='" + song + '\'' +
                ", name='" + name + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
