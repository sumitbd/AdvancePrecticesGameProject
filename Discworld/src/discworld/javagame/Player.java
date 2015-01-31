package discworld.javagame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private int player_id;
	private String player_name;
	private String player_color;	
	private List<Integer> minion_board_position = new ArrayList<Integer>();
	private List<Integer> building_board_position = new ArrayList<Integer>();
	private int money;
	private PersonalityCard player_personality_card = new PersonalityCard();
	

}
