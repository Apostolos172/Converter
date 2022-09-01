package properties;

public class Colors {
	
	public Colors() {
		// TODO Auto-generated constructor stub
	}

	public static int[] get(String colour) {
		int[] color;
		color = new int[3];
		
		switch(colour) {
		  case "red":
			color[0] = 128;
			color[1] = 50;
			color[2] = 50;
			break;
		  case "blue":
		    // code block
		    break;
		  default:
		    // code block
		}
		return color;
	}

}
