

import java.util.*;
public class QuestionShortestpath2 {
    public static float GEtShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir =path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //North
            if(dir=='N'){
                y++;

            }
            if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
           
        }
        int x2=x*x;
        int y2=y*y;
        return(float)Math.sqrt(x2+y2);
        

         
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(GEtShortestPath(path));
        
    }

    
}
