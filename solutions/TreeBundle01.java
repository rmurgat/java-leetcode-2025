package solutions;

public class TreeBundle01 {

    public TreeNode insertInOrder(int[] nums) {
        TreeNode head = new TreeNode();
        head.val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            insertInOrder(head, nums[i]);
        }
        return head;
    }

    public void insertInOrder(TreeNode head, int val) {
        if (head == null)
            return;

        if (val < head.val) {
            if (head.left == null)
                head.left = new TreeNode(val);
            else
                insertInOrder(head.left, val);
        } else {
            if (val > head.val) {
                if (head.right == null)
                    head.right = new TreeNode(val);
                else
                    insertInOrder(head.right, val);
            } else if (val == head.val)
                return;
        }
    }

    public void prettyTree(TreeNode head) {
        prettyTree(head, true, "", "");
    }

    public void prettyTree(TreeNode head, boolean last, String header, String side) {
        String elbow = "└──";
        String pipe = "│  ";
        String tee = "├──";
        String blank = "   ";
        if (head == null) return;
        System.out.println (header + (last?elbow:tee) + head.val+(side==""?"":"-"+side));
        if (head.left!=null) {
            prettyTree(head.left, (head.right!=null?false:true), header + (last?blank:pipe),"l" );
        }
        if (head.right!=null) {
            prettyTree(head.right, true, header + (last?blank:pipe), "r");
        }
    }

    public void printPreOrder(TreeNode head) {
        if (head == null) return;
        System.out.print(head.val + ",");
        printPreOrder(head.left);
        printPreOrder(head.right);
    }

    public void printPostOrder(TreeNode head) {
        if (head == null) return;
        printPostOrder(head.left);
        printPostOrder(head.right);
        System.out.print(head.val + ", ");
    }
    public void printInOrder(TreeNode head) {
        if (head == null) return;
        printInOrder(head.left);
        System.out.print(head.val + ", ");
        printInOrder(head.right);
    }

}
