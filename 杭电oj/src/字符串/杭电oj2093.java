package �ַ���;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ����oj2093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        answer asr[] = new answer[200];
        while(sc.hasNext()){
            int n = sc.nextInt();
            int t = sc.nextInt();
            int a = 0;
            int num;//�ύ��ȷ����Ŀ��
            int time;//�ύ��ʱ��
            while(sc.hasNext()){
                asr[a] = new answer();
                student1 s = new student1();
                s.name = sc.next();
//              if(s.name.equals("#")){
//                  break;
//              }//�Լ����Ե�ʱ����Ҫ��һ�������ģ���Ȼ�Լ����������
                asr[a].name=s.name;
                num =n;
                time=0;
                s.strMark= new String[n];//����Ҫnew ��Ȼ���ָ���쳣
                for(int i=0;i<n;i++){
                    s.strMark[i] = sc.next();
                    if(s.strMark[i].charAt(0)=='-'||s.strMark[i].equals("0")){
                        num--;//����ύ����Ϊ0������û���ύͨ������num��һ
                    }else{
                        //�ύͨ����
                        String s1="";//s1���ύ��ʱ��
                        String s2="";//s2���ύ����Ĵ���
                        boolean isS1 = true;
                        for(int k=0;k<s.strMark[i].length();k++){
                            if(isS1){
                                if(s.strMark[i].charAt(k)=='('){
                                    isS1=false;
                                    continue;
                                }
                                s1 = s1+s.strMark[i].charAt(k);
                            }else{
                                if(s.strMark[i].charAt(k)==')'){
                                    break;
                                }
                                s2 = s2+s.strMark[i].charAt(k);
                            }
                        }
                        //System.out.println("s1="+Integer.parseInt(s1));
                        //System.out.println("s2="+Integer.parseInt(s2));
                        if(s2.equals("")){
                            //����ύ�������Ϊ0
                            time+= Integer.parseInt(s1);
                        }else{
                            //���ύ���������
                            time += Integer.parseInt(s1)+(Integer.parseInt(s2)*t);
                        }
                    }
                }
                asr[a].time=time;
                asr[a].num=num;
                a++;
            }
            Arrays.sort(asr,0,a, new Comparator<answer>() {
                @Override
                public int compare(answer o1, answer o2) {
                    //�ύ��ȷ����Ŀ�����ǰ�档

                    if(o1.num>o2.num){
                        return -1;
                    }
                    if(o1.num<o2.num){
                        return 1;
                    }

                    //����ύ����ȷ��Ŀ������һ���ģ���timeС����ǰ�档
                    return o1.time-o2.time;
                }
            });
            for(int i=0;i<a;i++){
                System.out.printf("%-10s %2d %4d",asr[i].name,asr[i].num,asr[i].time);
                System.out.println();
            }
        }
    }
}

class student1 {
    //�����
    String name;
    String strMark[];
}

class answer {
    //�����
    String name;
    int num;
    int time;
}