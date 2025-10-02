package text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class text10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int []arr = {2,588,888,1000,10000};
        // 使用列表保存可用索引
        List<Integer> availableIndexes = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            availableIndexes.add(j);
        }
        
        while (!availableIndexes.isEmpty()) {
            // 随机选择一个索引位置
            int randomIndex = rand.nextInt(availableIndexes.size());
            // 获取实际数组索引
            int actualIndex = availableIndexes.get(randomIndex);
            
            System.out.println(arr[actualIndex] + "元的奖金被抽出");
            
            // 移除已抽取的索引
            availableIndexes.remove(randomIndex);
        }
    }

}
