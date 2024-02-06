package bookManagement;

public class Fiction implements Genre{
	
 private static double genreDiscount= 9;
	 
	 private String subGenre;
	 
	 final String genre= "fiction";
	 
	 public Fiction(String subGenre){
		 this.subGenre= subGenre;
	 }
	 
	 public static void setGenreDiscount(double gD) {
		 genreDiscount= gD;
	 }

	@Override
	public double getGenreDiscount() {
		// TODO Auto-generated method stub
		return genreDiscount;
	}

	@Override
	public String getSubGenre() {
		// TODO Auto-generated method stub
		return subGenre;
	}

	@Override
	public void setSubGenre(String subGenre) {
		// TODO Auto-generated method stub
		this.subGenre= subGenre;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	} 
	public String toString() {
		 return genre;
	 }
}
