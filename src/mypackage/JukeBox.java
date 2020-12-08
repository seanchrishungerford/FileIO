package mypackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JukeBox {
	
	ArrayList<Songs> songsList = new ArrayList<Songs>();
	
	public static void main(String[] args) {

		System.out.println("Original Song List: ");
		new JukeBox().outputSongsInfo();
		new JukeBox().addNewSong("Hotel California/ The Eagles");
		
		System.out.println("New song list: ");
		new JukeBox().outputSongsInfo();
	
		
		

	}
	
	public void addNewSong(String newsong) {
		
	    FileWriter fw;
		try {
			fw = new FileWriter("songs.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(newsong);
			bw.newLine();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	}

	public void outputSongsInfo() {
		try {
			getSongs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Object ob : songsList) {
			System.out.println(ob);
		}
	}
	
	public void getSongs() throws IOException {
		
		try {
			File file = new File("songs.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				addSongs(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSongs(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Songs nextSong = new Songs(tokens[0], tokens[1]);
		songsList.add(nextSong);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
