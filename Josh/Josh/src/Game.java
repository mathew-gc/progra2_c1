public class Game {
    private String name;
    private float gSize;
    private String gender;
    private Boolean isOnline;

    public Game(String pName, float pGSize, String pGender, Boolean pIsOnline){
        this.name = pName; 
        this.gSize = pGSize;
        this.gender = pGender;
        this.isOnline = pIsOnline;
    }

    public void setName(String pName){
        this.name = pName; 
    }

    public void setGSize(float pGSize){
        this.gSize = pGSize;
    }

    public void setGender(String pGender){
        this.gender = pGender;
    }

    public void setisOnline(Boolean pIsOnline){
        this.isOnline = pIsOnline;
    }

    public void printGame(){
        System.out.println("Nombre: " + name + "\nEspacio en GB: " + gSize + "\nGenero: " + gender + "\nEs online: " + isOnline);
    }
}
