package exercise.exercise_0512;

//知识迁移能力
/*
和为S的连续正数序列
题目描述
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,
你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
输出描述:
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */

/*
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 1;
        int right = 2;
        while(right > left){
            int num = (right-left+1)*(left+right)/2;//求和公式
            if(num == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=left; i<=right; i++){
                    list.add(i);
                }
                result.add(list);
                left++;
            }else if(num < sum){
                right++;
            }else{
                left++;
            }
        }
        return result;
    }
}
*/

/*
和为S的两个数字
题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。
 */
/*
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        //索引
        int left=0;
        int right=array.length-1;
        while(left<right){
            if(array[left]+array[right] == sum){
                result.add(array[left]);
                result.add(array[right]);
                break;
            }else if(array[left]+array[right] < sum){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}*/

/*
左旋转字符串
题目描述
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
/*
public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()== 0|| n == str.length()|| n ==0){
            return str;
        }
        n = n % str.length();
        return str.substring(n)+str.substring(0,n);
    }
}
*/

/*
翻转单词顺序列
题目描述
牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Solution {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0){
            return str;
        }
        String tmp = str.trim();
        if("".equals(tmp)){
            return str;
        }
        String[] s = tmp.split(" ");
        StringBuffer res = new StringBuffer();
        for(int i=s.length-1; i>=0; i--){
            if(!s[i].equals("")){
                res.append(s[i]);
                if(i>0){
                    res.append(" ");
                }
            }
        }
        return res.toString();
    }
}