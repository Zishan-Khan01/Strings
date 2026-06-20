public class question{
	public static float getShortestPath(String path){
		int x = 0, y = 0;
		for(int i=0; i<path.length(); i++){
			char direction = path.charAt(i);
			//south
			if(direction == 'S'){
				y--;
			}
			else if(direction == 'N'){
				y++;
			}
			else if(direction == 'W'){
				x--;
			}
			else{
				x++;
			}
		}
		int X2 = x*x;
		int Y2 = y*y;
		return (float)Math.sqrt(X2 + Y2);	//sqrt function returns double valu, so we have to type cast it first to float & also function return type should be float as well. ALSO sqrt of X2 and Y2 need not be always int that's why it should be float, to take into account the fractional point values(decimal values)(if any)
	}

	public static void main(String args[]){
		String path = "WNEENESENNN";
		System.out.println(getShortestPath(path));
	}
}