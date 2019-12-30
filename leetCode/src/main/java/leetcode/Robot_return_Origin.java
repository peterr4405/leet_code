package leetcode;

public class Robot_return_Origin {
    
    public static void main(String[] args) {
        
        String move="UUUDDLF";
        System.out.println(judgeCircle(move));
        String move2="UDLLRDUR";
        System.out.println(judgeCircle(move2));
    }
    

    public static boolean judgeCircle(String moves) {

        int length = moves.length();

        if (length % 2 == 1) {
            return false;
        }

        int left = 0, up = 0;

        char[] array = moves.toCharArray();
        for (char move : array) {
            switch (move) {
                case 'R':
                    left--;
                    break;
                case 'L':
                    left++;
                    break;
                case 'U':
                    up++;
                    break;
                case 'D':
                    up--;
                    break;
            }
        }
        return (left == 0 && up == 0);
    }
}
