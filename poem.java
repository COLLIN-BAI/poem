package String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class poem {
	public static void printsplit(String strsplit) {
		for (int i = 0; i<strsplit.length(); i = i+7) {
			if( i%2 == 1 ){//���i����2������Ϊ�㣬Ϊż�����֣���Ӿ��
				String split = strsplit.substring(i, i+7);
				System.out.print(split+ "��" + "\n");			
			} 
			if( i%2 == 0 ){//���i����2��������Ϊ�㣬Ϊ�������֣���Ӷ���
				String split = strsplit.substring(i, i+7);
				System.out.print(split+ "��");			
			} 
		}	
	}
	//ʹ��String���contain()�������ж��������Ƿ�����Ӵ�     srcStr���ַ���  findStr���ַ���
	public static int count(String srcStr, String findStr) {
		int count = 0;
		int index = 0;
		while ((index = srcStr.indexOf(findStr, index)) != -1) {
//indexOf()���÷��������ַ���indexOf��String�����Ӵ�String�ڸ������״γ��ֵ�λ�ã���0��ʼ��û�з���-1
			index = index + findStr.length();
			count++; // +1
		}
		return count;
	}
	
    public static void main(String[] args) {
        printsplit(args[0]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String strs = null;
        while(true){
            try {
                System.out.println("���������ͳ�ƹ�ʫ��ĳ���ֻ�ʳ��ֵĴ�����" );
                strs = br.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }
            break;
        }
		int count = count(args[0], strs);
        System.out.println(strs + " ���� " + count + " ��");
    }
}


