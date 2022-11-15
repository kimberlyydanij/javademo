package java016_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 직렬화(serializable)
 * 1. 객체를 연속적인 데이터로 변환하는 것이다. 반대는 역직렬화이다.
 * 2. 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.
 * 3. 객체를 저장하기 위해서는 객체를 직렬화 해야한다.
 * 4. 객체를 저장한다는 것은 객체의 멤버변수의 값을 저장한다는 것이다.
 * 5. 객체를 직렬화하여 입출력할 수 있는 스트림
 * 		ObjectInputStream, ObjectOutputStream
 * 6. 직렬화에서 제외할 멤버변수에서는 transient를 선언한다.
 */

class Phone implements Serializable{ // 직렬화
	String name;
	int price;
	
	public Phone() {
	}

	public Phone(String name, int price) {

		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s %d\n",name, price);
	}
} // end Phone

public class Java176_stream {

	public static void main(String[] args) {
		File file = new File("java016_stream/phone.dat");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);
			
			//객체에 직렬화가 안되어 있으면 Exception이 발생된다.
			//java.io.NotSerializableException: java016_stream.Phone
	
			
			Phone p = new Phone("android", 5000);
			os.writeObject(p);
			
			os.writeObject(new String("java"));
			System.out.println("객체 저장");
		} catch (FileNotFoundException e) {
			e.printStackTrace();		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				os.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	////////////////////////////////////////////////////////
		
		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			Phone p = (Phone)oi.readObject();
			System.out.println(p.toString());
			
			String sn = (String)oi.readObject();
			System.out.println(sn.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oi.close();
				fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	} //end main

} //inClass