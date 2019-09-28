/*
 * BinarySearch.java
 * 
 * Copyright 2019 Jesus Hernandez <Jesus Hernandez@DESKTOP-HONRQCH>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import javax.swing.JOptionPane;
public class BinarySearch {
	int BinSearch(int arr[],int value){
		int start=0, end = arr.length-1;
		
		while (start <= end){
			int middle = (start + end)/2;
			
			if(arr[middle]==value)
				return middle;
			
			if(arr[middle]<value)
				start = middle+1;
						
			else 
				end=middle-1;
		}
		return -1;
	}
	
	public static void main (String[] args) {
		BinarySearch bsearch = new BinarySearch();
		String input;
		int [] numbers = {3,6,7,8,12,15,22,36,45,48,51,53,64,69,72,89,95};
		input = JOptionPane.showInputDialog("enter search key");
		int key = Integer.parseInt(input);
		
		int location = bsearch.BinSearch(numbers,key);
		
		
		if(location==-1)
			JOptionPane.showMessageDialog(null,"The key is not in the array");
		else
			JOptionPane.showMessageDialog(null,key + " found at index " + location);
	}
}
