package �Թ�����;

import java.awt.Color;  
import java.awt.Graphics;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.Random;  
  
import javax.swing.JFrame;  
  
  
public class Maze extends JFrame{  
  
    private int row;//����  
    private int col;    //����  
    private DisJoinSet disjSet;  
    private int winHeight=700;    
    private int winWidth=780;    
      
    public Maze(int row,int col){  
        this.row = row;  
        this.col = col;  
        this.setTitle("�Թ�");    
        this.setSize(winWidth,winHeight);    
        this.setVisible(true);    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }  
      
    public static void main(String[] args) {  
        int rowCount = 50;  
        int colCount = 50;  
        Maze maze = new Maze(rowCount,colCount);  
  
    }  
  
    public void paint(Graphics g){    
        super.paint(g);  
        //����Ϊ��ɫ    
        g.setColor(Color.white);    
        g.fillRect(0, 0, winWidth, winHeight);    
        g.setColor(Color.black);    
        final int extraWidth = 20;  
        final int cellWidth = (winWidth-2*extraWidth)/row;//����ÿ�����ӵĿ��  
        final int cellHeight = (winHeight-4*extraWidth)/col;//����ÿ�����ӵĸ߶�  
        for(int i=0;i<row;i++)  {  
            for(int j=0;j<col;j++)    
            {    
                //��ʼ��m*n�������  
                g.drawRect(i*cellWidth+extraWidth,j*cellHeight+2*extraWidth, cellWidth, cellHeight);    
            }    
        }  
          
        int lastPos = getLastElePos();//�Թ����һ����ʽ�Ĵ�������  
        //��㣬�յ����⴦��  
        g.setColor(Color.red);    
        g.fillRect(extraWidth, 2*extraWidth, cellWidth, cellHeight);  
        g.fillRect((lastPos% row)*cellWidth + extraWidth,(lastPos/ row)*cellHeight + 2*extraWidth, cellWidth, cellHeight);  
          
        this.setDisjSet(new DisJoinSet(row*col));  
        g.setColor(Color.white);  //�ú�ɫ��ɫ  
        while(disjSet.find(0) != disjSet.find(lastPos)){//��������յ㻹û��ͬһ���ȼ���  
            /* 
             *  ���Թ��������һ���㣬���ҵ��õ���Χһ�㣬ʹ������������ͬһ���ȼ��� 
             */  
            Random random = new Random();  
            int randPos = random.nextInt(lastPos+1);//+1��Ϊ������������һλ  
            int rowIndex = randPos % row;  
            int colIndex = randPos / col;  
            List<Integer> neighborPos = getNeighborNums(rowIndex, colIndex) ;  
            int randNeighbor = neighborPos.get(random.nextInt(neighborPos.size()));  
  
            if(disjSet.find(randPos)  ==  disjSet.find(randNeighbor)){//������ͬһ���ȼ���  
                continue;  
            }else{  
                int aRoot = disjSet.find(randPos);  
                int bRoot = disjSet.find(randNeighbor);  
                disjSet.union(aRoot, bRoot);  
                int maxNum = Math.max(randPos, randNeighbor);//ȡ�ýϴ��  
                int x1=0,y1=0,x2=0,y2=0;    
                if(Math.abs(randPos-randNeighbor) == 1){//˵����ͬһ�У������߸���  
                    x1= x2=(maxNum% row)*cellWidth + extraWidth;  
                    y1=(maxNum/ row)*cellHeight + 2*extraWidth;  
                    y2=y1+cellHeight;  
                }else{//˵����ͬһ�У��ú��߸���  
                    y1=y2=(maxNum/ row)*cellHeight + 2*extraWidth;  
                    x1=(maxNum% row)*cellWidth + extraWidth;  
                    x2=x1+cellWidth;  
                }  
//              System.err.println("x1="+x1+",x2="+x2+",y1="+y1+",y2="+y2);  
                 g.drawLine(x1, y1, x2, y2);  
            }  
        }  
          
    }  
  
    /** 
     *  ȡ��Ŀ���������Χ�ĸ���Ч�� 
     */  
    public List<Integer> getNeighborNums(int rowIndex,int colIndex){  
        List<Integer> neighborPos = new ArrayList<Integer>(4);  
        //��Ԫ��  
        if(isPointInMaze(rowIndex+1,colIndex)){  
            neighborPos.add(getCoordinateNum(rowIndex+1,colIndex));  
        }  
        //��Ԫ��  
        if(isPointInMaze(rowIndex,colIndex+1)){  
            neighborPos.add(getCoordinateNum(rowIndex,colIndex+1));  
        }  
        //��Ԫ��  
        if(isPointInMaze(rowIndex-1,colIndex)){  
            neighborPos.add(getCoordinateNum(rowIndex-1,colIndex));  
        }  
        //��Ԫ��  
        if(isPointInMaze(rowIndex,colIndex-1)){  
            neighborPos.add(getCoordinateNum(rowIndex,colIndex-1));  
        }  
  
        return neighborPos;  
    }  
    public int getLastElePos(){  
        return row*col-1;  
    }  
  
    public DisJoinSet getDisjSet() {  
        return disjSet;  
    }  
  
    public void setDisjSet(DisJoinSet disjSet) {  
        this.disjSet = disjSet;  
    }  
  
    /** 
     *  �������귵�ض�Ӧ��ֵ 
     *  ������4*3����(0��0)����0;(3,2)����10 
     */  
    public int getCoordinateNum(int x,int y){  
        return y*col + x;  
    }  
      
  
    /** 
     *  �жϸ��������Ƿ����Թ������� 
     */  
    public boolean isPointInMaze(int x,int y){  
        if(x < 0 || y < 0) return false;  
        return x < row && y <col;  
    }  
} 
 class DisJoinSet {  
	  
    private int[] eleRoots;  
      
    public DisJoinSet(int num){  
        this.eleRoots = new int[num];  
        for(int i=0;i<num;i++){  
            getEleRoots()[i] = -1;  
        }  
    }  
      
    public int find(int ele){  
        if(getEleRoots()[ele] < 0){  
            return ele;  
        }  
          
        return find(getEleRoots()[ele]);  
    }  
      
    public void union(int root1,int root2){  
        //����Ƚ�С������Ϊ��Ƚϴ����������  
        if(getEleRoots()[root1] > getEleRoots()[root2]){  
            getEleRoots()[root1] = root2;  
        }else{  
            if(getEleRoots()[root1] == getEleRoots()[root2]){//���һ������������  
                getEleRoots()[root1]--;  
            }  
            getEleRoots()[root2] = root1;  
        }  
    }  
  
    public int[] getEleRoots() {  
        return eleRoots;  
    }  
  
}  