package String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class poem {
	public static void printsplit(String strsplit) {
		for (int i = 0; i<strsplit.length(); i = i+7) {
			if( i%2 == 0 ){//如果i除以2的余数不为零，为奇数个字。
				String split = strsplit.substring(i, i+7);//截取字符串从i到i+7。
				System.out.print(split+ "，");		//输出加逗号。	
			} 
			if( i%2 == 1 ){//如果i除以2的余数为零，为偶数个字。
				String split = strsplit.substring(i, i+7);//截取字符串从i到i+7。
				System.out.print(split+ "。" + "\n");		//输出加句号。	
			} 	
		}	
	}
	//使用String类的contain()方法，判断整串中是否包含子串     srcStr父字符串  findStr子字符串
	public static int count(String srcStr, String findStr) {
		int count = 0;
		int index = 0;
		while ((index = srcStr.indexOf(findStr, index)) != -1) {
//indexOf()的用法：返回字符中indexOf（String）中子串String在父串中首次出现的位置，从0开始！没有返回-1
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
                System.out.println("输入参数，统计古诗中某个字或词出现的次数：" );
                strs = br.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }
            break;
        }
		int count = count(args[0], strs);
        System.out.println(strs + " 出现 " + count + " 次");
    }
}


