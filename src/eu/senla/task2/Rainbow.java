package eu.senla.task2;

public class Rainbow {
    private final String[] colors = {"red","orange","yellow", "green", "blue", "dark blue" , "purple"};

    public Rainbow(){
        System.out.println("Print rainbow: ");
        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
