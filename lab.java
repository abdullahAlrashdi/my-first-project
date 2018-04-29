import java.io.*;
import java.util.*;

public class lab {

	private String name;
	private String location;
	private Equipment[] arrEq;
	private int counter;
	
	lab(String n , String loc){
		name = n;
		location = loc;
		arrEq = new Equipment[15];
		counter = 0;
	}
	void addEquipment(Equipment e){
		
		if(counter == arrEq.length)
			throw new ArrayIndexOutOfBoundsException();
		else {
			if( e instanceof printer )
				arrEq[counter++] = new printer((printer)e);
			else if( e instanceof Laptop)
				arrEq[counter++] = new Laptop((Laptop)e);
			
		}
		
	}
	void SaveLabtop(String filename) throws IOException {
		
		 File f = new File(filename);
		 FileOutputStream r = new FileOutputStream(f);
		 ObjectOutputStream obj = new ObjectOutputStream(r);
		 try {
			 for(int i = 0 ; i <= counter ; i++) {
				 if( arrEq[i] instanceof Laptop) {
					 obj.writeObject(arrEq[i]);
					 
				 }
			 }
		 } catch( ArrayIndexOutOfBoundsException e) {
		obj.close();	 
		 }
	}
	void readAddPrinters(String filename) throws IOException {
	
		File f = new File(filename);
		FileInputStream x = new FileInputStream(f);
		ObjectInputStream obj = new ObjectInputStream(x);
			
		Equipment d;
		try {
				
			while(true) {
				d =  (Equipment) obj.readObject();
				if(d instanceof printer)
					arrEq[counter++] = new Laptop((Laptop)d);	
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" array out of bounds");
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			obj.close();
		}
		
	}
	public int getNbPrinters(double s) throws Exception{
		int x = 0;
		for(int i = 0; i < counter ; i++) {
			if(arrEq[i] instanceof printer && ((printer)arrEq[i]).getSpeed() > s)
				x++;
		}
		if( x < 15 ) {
			throw new Exception("error");
		}
		else return x;
	}
	public printer[] getPrinter(int speed) {
		
		int x = 0;
		for(int i = 0; i < counter ; i++) {
			if(arrEq[i] instanceof printer && ((printer)arrEq[i]).getSpeed() > speed)
				x++;
		}
		printer[] arr = new printer[x];
		int arrcounter = 0;
		for(int i  =0 ; i < counter ; i++) {
			if(arrEq[i] instanceof printer && ((printer)arrEq[i]).getSpeed() > speed) {
				arr[arrcounter++] = new printer((printer)arrEq[i]);
			}

		}
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
}
