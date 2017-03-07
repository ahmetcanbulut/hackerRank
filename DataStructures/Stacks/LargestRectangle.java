// Largest Rectangle - HackerRank

import java.io.*;
import java.util.*;

class Building{
		private int height;
		private int count;
		
		public Building(int h){
			height = h;
			count = 1;
		}
		
		public void incrCount(){
			count++;
		}
		
		public int calcArea(){
			return height*count;
		}
    
        public int getHeight(){
            return height;
        }
    
        public void setCount(int c){
            count = c;
        }
    
        public int getCount(){
            return count;
        }
	}

public class Solution {
    
    static boolean containsHeight(ArrayList<Building> list,int height){
        int size = list.size();
        for(int i=0;i<size;i++){
            if(list.get(i).getHeight()==height){
                return true;
            }
        }
        return false;
    }

    static int calculateBackTill(ArrayList<Building> list, int lowerLimit){
        int curIdx = list.size()-1;
        int max = 0;
        for(int i=curIdx;i>=0;i--){
            int height = list.get(i).getHeight();
            if(height<=lowerLimit){
                break;
            }
            
            int result = list.get(i).calcArea();
            if(result>max){
                max = result;
            }
        }
        return max;
    }
    
    static int popHigherTill(ArrayList<Building> list, int lowerLimit){
        int curIdx = list.size()-1;
        int popCount = 0;
        for(int i=curIdx;i>=0;i--){
            int height = list.get(i).getHeight();
            if(height<=lowerLimit){
                break;
            }
            popCount = list.get(i).getCount();
            list.remove(i);
        }
        return popCount;
    }
    
    static void increasePrev(ArrayList<Building> list){
        int size = list.size();
        for(int i=0;i<size;i++){
            list.get(i).incrCount();
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int bCount = sc.nextInt();
        
        ArrayList<Building> buildingStack = new ArrayList<Building>();
        
        int maxArea = 0;
        int curIndex = 0;
        
        int currentHeight = sc.nextInt();
        
        Building firstB = new Building(currentHeight);
        buildingStack.add(firstB);
        
        for(int i=0;i<bCount-1;i++){
            currentHeight = sc.nextInt();
            int topIdx = buildingStack.size()-1;
            int top = buildingStack.get(topIdx).getHeight();
            if(currentHeight>top){ 
                // increase all prev, add new                
                increasePrev(buildingStack);
                Building higherBuilding = new Building(currentHeight);
                buildingStack.add(higherBuilding);                              
            }else if(currentHeight == top){ 
                // increase all prev
                increasePrev(buildingStack);
            }else{  // (currentHight < top)
                // calculate back until the same level, remove the higher ones between
                
                int localMax = calculateBackTill(buildingStack,currentHeight);
                if(localMax>maxArea){
                    maxArea = localMax;
                }
                int popCount = popHigherTill(buildingStack,currentHeight);
                if(!containsHeight(buildingStack,currentHeight)){
                    Building replacementForHighers = new Building(currentHeight);
                    replacementForHighers.setCount(popCount);
                    buildingStack.add(replacementForHighers);
                }
                increasePrev(buildingStack);
            }
        }
        
        // Calculate remaining
        int remainingMax = calculateBackTill(buildingStack,0); // calculate all (until level 0)
        if(remainingMax>maxArea){
            maxArea = remainingMax;
        }
        
        System.out.println(maxArea);
    }
}
