/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            while (size-- > 0) {
                TreeNode node = queue.poll();
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                
                // last one in this level
                if (size == 0) res.add(node.val);
            }
        }
        
        return res;
    }
}