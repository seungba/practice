package lec27Pjt003;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass003 {
	
	public static void main(String[] args) {
		
		InputStream iS = null;
		OutputStream oS = null;
		
		try {
			iS = new FileInputStream("C:\\java\\pjt_ex\\hello.txt"); // 읽어와서
			oS = new FileOutputStream("C:\\java\\pjt_ex\\helloCopy.txt"); // 출력
			
			byte[] arr = new byte[3];
			
			while(true) {
				int len = iS.read(arr);
				if(len == -1) break;
				oS.write(arr, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (iS != null) {
				try {
					iS.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
			
			if (oS != null) {
				try {
					oS.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
		
	}
	
}
