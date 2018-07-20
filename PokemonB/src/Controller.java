import javax.swing.ImageIcon;

public class Controller {

	private Logic l;
	private PokeGUI PGUI;
public Controller(Logic l, PokeGUI PGUI){
this.l = l;
this.PGUI = PGUI;

PGUI.getLabel1_2().setText("Bulbasaur");
PGUI.getLabel1_3().setText("1");
PGUI.getLabel1_4().setText("Pallet Town");
PGUI.getLabel2_2().setText("Charizard");
PGUI.getLabel2_3().setText("2");
PGUI.getLabel2_4().setText("Not Avaliable");
PGUI.getLabel3_2().setText("Latios");
PGUI.getLabel3_3().setText("3");
PGUI.getLabel3_4().setText("Southern Island");
PGUI.getLabel4_2().setText("Latias");
PGUI.getLabel4_3().setText("4");
PGUI.getLabel4_4().setText("Southern Island");
PGUI.getLabel5_2().setText("Mewtwo");
PGUI.getLabel5_3().setText("5");
PGUI.getLabel5_4().setText("Cerulean Cave");



ImageIcon imgThisImg = new ImageIcon("C:\\Users\\Billy\\Documents\\workspace\\PokemonB\\PokePics\\Bulbasaur.PNG");
ImageIcon imgThisImg2 = new ImageIcon("C:\\Users\\Billy\\Documents\\workspace\\PokemonB\\PokePics\\Charizard.PNG");
ImageIcon imgThisImg3 = new ImageIcon("C:\\Users\\Billy\\Documents\\workspace\\PokemonB\\PokePics\\Latios.PNG");
ImageIcon imgThisImg4 = new ImageIcon("C:\\Users\\Billy\\Documents\\workspace\\PokemonB\\PokePics\\Latias.PNG");
ImageIcon imgThisImg5 = new ImageIcon("C:\\Users\\Billy\\Documents\\workspace\\PokemonB\\PokePics\\Capture.PNG");

PGUI.getLabel1_1().setIcon(imgThisImg);
PGUI.getLabel2_1().setIcon(imgThisImg2);
PGUI.getLabel3_1().setIcon(imgThisImg3);
PGUI.getLabel4_1().setIcon(imgThisImg4);
PGUI.getLabel5_1().setIcon(imgThisImg5);
}
}
