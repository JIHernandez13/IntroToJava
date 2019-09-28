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
import javax.swing.JOptionPane;

class Complex{
	public double real, imaginary;
	JOptionPane dialog = new JOptionPane();
	Complex(double r, double i){
		real=r;
		imaginary=i;
	}
	
	public Complex sum(Complex a,Complex b){
		double r, i;
		r=a.real + b.real;
		i=a.imaginary + b.imaginary;
		Complex c = new Complex(r,i);
		return c;
	}
	
	public Complex diff(Complex a,Complex b){
		double r, i;
		r=a.real - b.real;
		i=a.imaginary - b.imaginary;
		Complex c = new Complex(r,i);
		return c;
	}
	
	public String print(){
		String val;
		val=String.format("(%.2f,%.2f)",this.real,this.imaginary); 
		return val;
	}
}

public class lab4 {
	
	public static void main (String[] args) {
		Complex x = new Complex(1,2);
		Complex y = new Complex(1,1);
		
		Complex result = new Complex(0,0);
		JOptionPane.showMessageDialog(null,"a="+x.print()+"\nb="+y.print()+
		"\na+b="+result.sum(x,y).print()+"\na-b="+result.diff(x,y).print());
		
	}
}

