package bookManagement;

import java.io.Serializable;

public interface Genre extends Serializable{
	 
	 public double getGenreDiscount();
	 
	 public String getSubGenre();
	 
	 public void setSubGenre(String s);
	 
	 public String getGenre();
	 
	 public String toString();
	 
	 
}
