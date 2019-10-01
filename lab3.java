/*
* lab4.java
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
import java.util.Scanner;
import javax.swing.JOptionPane;

class BinarytoDecimal {
	private int dec;

	//size of int is 4bytes in java
	//will write according to that assumption
	void convert(int bin){
		int value = 0;
		for(int i =0;bin>0;i++){
			//if lead bit is a 1, increment value by respective power of 2
			if(bin%2==1)
			value+= Math.pow(2,i);

			//basically a shift right for integer inputs
			//not using binary literals because i don't feel like it
			//well aware that binary literal has ToInteger function. Don't care.
			bin=bin/10;
		}
		print(value);
	}
	void print(int val){
		System.out.println(val);
	}
}

class Circle{
	float radius, area, circumference;
	Circle(){
		radius=0;
		area=0;
		circumference=0;
	}

	void SetRadius(float r){
		radius = r;
		area=r*r*(float)Math.PI;
		circumference=2*r*(float)Math.PI;
	}

}
public class lab3 {

	public static void main (String[] args) {
		BinarytoDecimal a = new BinarytoDecimal();
		a.convert(1001); //decimal 9
		a.convert(11); //decimal 2
		a.convert(110100100); // You know what this is ;)

		String ans = new String();
		ans = JOptionPane.showInputDialog(null,"enter radius");
		Circle b = new Circle();
		b.SetRadius(Integer.parseInt(ans));
		JOptionPane.showMessageDialog(null,"Radius = " + b.radius + "\nArea = "+ b.area +"\nCircumference = " + b.circumference + "\n" );
	}
}
