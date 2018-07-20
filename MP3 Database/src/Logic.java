import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;


public class Logic {
private GUI g;
private ArrayList<MP3> database = new ArrayList();
private String[] details;
private MP3 song;
public Logic(GUI g){
	this.g = g;
	g.addAdd(new AddActionListener());
	g.addSearch(new SearchListener());
	g.addDelete(new RemoveListener());
}

private void refresh()
{
	details = new String[database.size()];
	for(int x = 0; x < database.size(); x++)
	{
		details[x]= ("Song ID: "+ x +" "+ database.get(x).changeToString());
	}
	g.setResultList(details);	
}

class SearchListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		details = new String[database.size()];
		for(int x = 0; x < database.size(); x++)
		{
			if(g.getSearchField().getText().contains(database.get(x).getTitle()) ||
					g.getSearchField().getText().contains(database.get(x).getArtist()) ||
					g.getSearchField().getText().contains(database.get(x).getGenre())
					)
			details[x] = ("Song ID: "+ x +" "+ database.get(x).changeToString());
		}
		g.setResultList(details);	
	}
		
}

class AddActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		song = new MP3();
		song.setArtist(g.getArtist().getText());
		song.setGenre(g.getGenre().getText());
		song.setTitle(g.getTitleField().getText());
		database.add(song);
		refresh();
	}
}

class RemoveListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		database.remove(Integer.parseInt(g.getSongID().getText()));
refresh();
	}
}
}
