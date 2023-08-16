import java.util.Arrays;

public class Telephone {


    Bank bank;

    private String name;
    Notes[] notes;


    public Telephone(Bank bank, String name, Notes[] notes) {
        this.bank = bank;
        this.name = name;
        this.notes = notes;
    }







    public void deleteBook22(String name, String productName) {
        int indexToRemove = -1;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getName().equals(productName) && notes[i].getName().equals(name)) {
                indexToRemove = i;

            }
        }
        if (indexToRemove != -1) {
            Notes[] arr11 = new Notes[notes.length - 1];
            int j = 0;
            for (int i = 0; i < notes.length - 1; i++) {
                if (i != indexToRemove) {
                    arr11[j] = notes[i];

                    j++;
                    if (notes[i] != null)
                        System.out.println(notes[i]);
                }
            }

            notes = arr11;

            notes = Arrays.copyOf(arr11, arr11.length - 1);
        }


    }

    public Notes[] addNotes2(Notes note) {
        for(Notes n: notes){
            if(!n.equals(note)){
                Notes[] nn=new Notes[notes.length+1];
                for(int i=0; i<notes.length; i++){
                    nn[i]=notes[i];
                }
                nn[notes.length]=note;
                notes=Arrays.copyOf(nn, nn.length);
                return notes;
            }
        }
        return null;
    }

    public String updateInfo(String name, int newQuantity) {
        for(Notes n: notes){
            if(n.getName().equals(name)){
                n.setQuantity(newQuantity);
                System.out.println(n);
            }
        }
        return "Succesfully updated";
    }


    @Override
    public String toString() {
        return "Telephone{" +
                "bank=" + bank +
                ", name='" + name + '\'' +
                '}';
    }


}


















