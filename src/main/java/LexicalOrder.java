import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/lexicographical-numbers/">https://leetcode-cn.com/problems/lexicographical-numbers/</a><br/>
 * 给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。<br/>
 * 你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。<br/>
 *
 * 示例 1：
 * 输入：n = 13
 * 输出：[1,10,11,12,13,2,3,4,5,6,7,8,9]<br/>
 * 示例 2：
 * 输入：n = 2
 * 输出：[1,2]<br/>
 * 提示：
 * 1 <= n <= 5 * 104
 * @author <a href="https://leetcode-cn.com/problems/lexicographical-numbers/solution/by-ac_oier-ktn7/">宫水三叶</a>
 */
public class LexicalOrder {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++) {
            dfs(i, n);
        }
        return ans;
    }
    void dfs(int current, int limit) {
        if (current > limit) {return ;}
        ans.add(current);
        for (int i = 0; i <= 9; i++) {
            dfs(current * 10 + i, limit);
        }
    }
}
