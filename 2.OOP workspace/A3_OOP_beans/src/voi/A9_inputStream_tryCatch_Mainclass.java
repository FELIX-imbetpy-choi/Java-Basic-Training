package voi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class A9_inputStream_tryCatch_Mainclass {

	public static void main(String[] args) {
		
		//이해안가는 부분 설명이 거의 생각나질 않는다.

		
		//파일 내용 불러오기
		InputStream is = null;
		try {   //파일이 없을 수도 있기 때문에 오류를 방지함
			is = new FileInputStream("c:/temp/data.txt");  //초기화로 객체로 불러와서 수정했을때 위험성을 막는다.
			while(true) {
				int i = is.read();
				System.out.println("Data : " + i);
				if(i == -1) {
					break;
				}
				}
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally { //트라이에서 이상이 없던가 캐치에서 이상이 있어도 결론적으로 도달함. 정상으로 읽어도 에러 걸려도 꺼줘야 하니까 만들었다.
			try {
				if(is == null) { //마지막 줄까지 다 읽었나 물어보는 것 - close를 안하면 다른 사람이 읽을 수 없기  때문에 close
					is.close();
				}
			} catch(Exception e2) {
				System.out.println(e2);
			}
			
		}
		
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:/temp/data1.txt");
			String str = "오늘은 날씨가 춥습니다.";
			byte [] bs = str.getBytes();
			
			os.write(bs);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally { //트라이에서 이상이 없던가 캐치에서 이상이 있어도 결론적으로 도달함. 정상으로 읽어도 에러 걸려도 꺼줘야 하니까 만들었다.
			try {
				if(os != null) { //마지막 줄까지 다 읽었나 물어보는 것 - close를 안하면 다른 사람이 읽을 수 없기  때문에 close
					os.close();
				}
			} catch(Exception e2) {
				System.out.println(e2);
			}
			
		}
		
		//-------------------------------------------------------------
		}
			
		
	}


