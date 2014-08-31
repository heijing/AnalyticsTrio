import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestGit {

		public static void main(String[] args){
			int n = 0;
			getCommandLineValue(n);
			getFileInput();
		}
		
		public static void getCommandLineValue(int n){
			int jim = 0;
			System.out.println("Please enter a value: ");
			Scanner keyboard = new Scanner(System.in); 
			jim = keyboard.nextInt(); 
			System.out.println(jim);
			keyboard.close();
		}
		
		public static void getFileInput(){
			String pathin = "C:\\Users\\Blee\\Desktop\\in.txt";
			String pathou = "C:\\Users\\Blee\\Desktop\\out.txt";		

			try {
				InputStream is = new FileInputStream(pathin);
				OutputStream os = new FileOutputStream(pathou);
				int c;
				while( ( c = is.read() ) != -1 ){
					System.out.print(( char ) c );;
					os.write( c );
					
				}
				is.close();
				os.close();  
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

		
}
