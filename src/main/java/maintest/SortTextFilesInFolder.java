package maintest;

import java.io.File;
import java.util.Arrays;

public class SortTextFilesInFolder {

	public static void main(String[] args) {
		String path="C:/Users/1543937/Desktop/Java";
		 String[] dirListing = null;
		 File dir = new File(path);
		 dirListing = dir.list();
		 Arrays.sort(dirListing);
		 System.out.println(Arrays.deepToString(dirListing));
		 

	}

}

//File[]

//It returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname

//https://data-flair.training/blogs/java-file-class/

//.sort - Sorts the specified array into ascending numerical order.

//https://www.geeksforgeeks.org/array-class-in-java/

//deepToString

//Returns a string representation of the “deep contents” of the specified array. If the array contains other arrays as elements, the string representation contains their contents and so on. This method is designed for converting multidimensional arrays to strings. The simple toString() method works well for simple arrays, but doesn’t work for multidimensional arrays. This method is designed for converting multi-dimensional arrays to strings.